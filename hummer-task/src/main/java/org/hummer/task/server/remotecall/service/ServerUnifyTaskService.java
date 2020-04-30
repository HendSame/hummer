package org.hummer.task.server.remotecall.service;

import org.hummer.task.vo.TaskAjaxResult;

/**
 * @author zhujinming6
 * @create 2019-10-11 10:38
 * @update 2019-10-11 10:38
 **/
public interface ServerUnifyTaskService {

    TaskAjaxResult<Boolean> dispatchTask(String server,String taskName);
}
