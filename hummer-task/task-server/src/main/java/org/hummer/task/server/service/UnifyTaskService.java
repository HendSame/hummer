package org.hummer.task.server.service;

import org.hummer.task.core.common.UnifyTaskStatusType;
import org.hummer.task.core.vo.*;
import org.hummer.task.server.model.UnifyTask;
import org.hummer.task.server.delayqueue.UnifyTaskQueueElement;

import java.util.List;

/**
 * @author zhujinming6
 * @create 2019-10-11 14:08
 * @update 2019-10-11 14:08
 **/
public interface UnifyTaskService {

    /**
     * 处理任务上报的状态
     *
     * @param taskStatus
     * @return
     */
    TaskAjaxResult<Boolean> dealTaskStatus(UnifyTaskStatus taskStatus);

    /**
     * 执行任务调度
     */
    void dispatchTask();

    TaskAjaxResult<Boolean> taskRegister(UnifyTaskRegister taskRegister);

    /**
     * 批量插入
     *
     * @param taskRegisters
     * @return
     */
    TaskAjaxResult<Boolean> tasksRegister(List<UnifyTaskRegister> taskRegisters);

    /**
     * 检查任务是否存在在数据库中
     *
     * @param taskRegister
     * @return
     */
    UnifyTask checkTask(UnifyTaskRegister taskRegister);

    void dispatchTask(UnifyTaskQueueElement msg);

    /**
     * 启动定时任务定时调度线程
     */
    void scheduleStart();

    /**
     * 关闭定时任务定时调度线程
     */
    void scheduleDestroy();

    /**
     * 更新任务执行时间
     *
     * @param tasks
     * @return
     */
    TaskAjaxResult<Boolean> tasksUpdate(List<UnifyTaskUpdate> tasks);

    TaskAjaxResult<BasicTask> taskByNo(String taskNo, String server);

    void updateTaskStatusAndTryTimes(String server, String taskNo, UnifyTaskStatusType executing, int retryTimes);
}