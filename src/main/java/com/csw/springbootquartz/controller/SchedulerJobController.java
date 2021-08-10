package com.csw.springbootquartz.controller;

import com.csw.springbootquartz.task.ControllerTask;
import com.csw.springbootquartz.task.ControllerTask2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
public class SchedulerJobController {
    @Autowired
    private ControllerTask controllerTask;
    @Autowired
    private ControllerTask2 controllerTask2;

    @RequestMapping("a")
    public void start() {
        controllerTask.run();
    }

    @RequestMapping("ai")
    public void destory() {
        ControllerTask.stopJob();
    }

    @RequestMapping("b")
    public void startb() {
        controllerTask2.run();
    }

    @RequestMapping("bi")
    public void destoryb() {
        ControllerTask2.stopJob();
    }


}
