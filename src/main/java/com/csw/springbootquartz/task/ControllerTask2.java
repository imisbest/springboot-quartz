package com.csw.springbootquartz.task;

import com.csw.springbootquartz.entity.SchedulerJob;
import com.csw.springbootquartz.service.SchedulerJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
public class ControllerTask2 {
    private static final ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
    @Autowired
    private SchedulerJobService schedulerJobService;

    public static void stopJob() {
        System.out.println("打断当前任务");
        threadPoolTaskScheduler.destroy();
    }

    public void run() {
        ControllerTask2.stopJob();
        threadPoolTaskScheduler.initialize();
        SchedulerJob schedulerJob = schedulerJobService.findByid("a823f7054ac640c7a4ed0fef4e994c06");
        System.out.println("进入定时任务" + schedulerJob);
        Runnable runnable = () -> {
            System.out.println("请书写业务代码" + System.currentTimeMillis());
        };
        // 0 0 0 0 0 7
        //0/5 * * * * *
        threadPoolTaskScheduler.schedule(runnable, new CronTrigger(schedulerJob.getCron()));
    }
}
