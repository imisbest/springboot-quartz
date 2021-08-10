package com.csw.springbootquartz.controller;

import com.csw.springbootquartz.task.ControllerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
public class SchedulerJobController {
    @Autowired
    private ControllerTask controllerTask;

    @RequestMapping("b")
    public void start() {
        controllerTask.run();
    }
}
