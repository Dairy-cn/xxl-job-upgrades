package com.casit.job.admin.function.core.alarm;

import com.casit.job.admin.function.core.model.XxlJobInfo;
import com.casit.job.admin.function.core.model.XxlJobLog;

/**
 * @author xuxueli 2020-01-19
 */
public interface JobAlarm {

    /**
     * job alarm
     *
     * @param info
     * @param jobLog
     * @return
     */
    public boolean doAlarm(XxlJobInfo info, XxlJobLog jobLog);

}
