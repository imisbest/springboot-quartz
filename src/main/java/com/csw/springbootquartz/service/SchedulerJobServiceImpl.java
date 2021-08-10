package com.csw.springbootquartz.service;

import com.csw.springbootquartz.dao.SchedulerJobDao;
import com.csw.springbootquartz.entiey.SchedulerJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerJobServiceImpl implements SchedulerJobService{
    @Autowired
    private SchedulerJobDao schedulerJobDao;

    @Override
    public SchedulerJob findByid(String id) {
        return schedulerJobDao.selectById(id);
    }

}
