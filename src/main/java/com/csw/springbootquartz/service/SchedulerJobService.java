package com.csw.springbootquartz.service;

import com.csw.springbootquartz.entiey.SchedulerJob;

public interface SchedulerJobService {
    SchedulerJob findByid(String id);
}
