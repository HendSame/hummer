package org.hummer.cluster.event;

import org.hummer.cluster.vo.ElectResponse;
import org.springframework.context.ApplicationEvent;

/**
 * 选举事件
 *
 * @author zhujinming6
 * @create 2019-10-10 10:48
 * @update 2019-10-10 10:48
 **/
public class ElectEvent extends ApplicationEvent {

    /**
     * 选举结果
     */
    ElectResponse electResponse;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ElectEvent(Object source, ElectResponse electResponse) {
        super(source);
        this.electResponse = electResponse;
    }

    public ElectResponse getElectResponse() {
        return electResponse;
    }
}
