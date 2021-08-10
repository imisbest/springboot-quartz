package com.csw.springbootquartz.service;

import com.csw.springbootquartz.entity.SchedulerJob;

public interface SchedulerJobService {
    SchedulerJob findByid(String id);
}
