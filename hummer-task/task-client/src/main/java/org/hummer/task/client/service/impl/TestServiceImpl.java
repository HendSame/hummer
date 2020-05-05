package org.hummer.task.client.service.impl;

import org.hummer.task.core.aop.EnableUnifyTask;
import org.hummer.task.core.aop.UnifyTask;
import org.hummer.task.client.service.TaskExecuteService;
import org.hummer.task.client.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * 测试类
 *
 * @author zhujinming6
 * @create 2019-10-11 12:30
 * @update 2019-10-11 12:30
 **/
@EnableUnifyTask
public class TestServiceImpl implements TestService {

    private Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

    @Resource
    TaskExecuteService taskExecuteService;

    /**
     * 执行任务
     *
     * @return
     */
    @Override
    @UnifyTask(taskNo = "test", cron = "0 0 */1 * * ?")
//    @Deprecated
    public void task() {
        // 处理逻辑
        return;
    }

}