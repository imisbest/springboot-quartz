package com.csw.springbootquartz.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@TableName("SchedulerJob")
public class SchedulerJob{
    private String id;
    private String name;
    @TableField("group_job")
    private String groupJob;
    private String cron;
    @TableField("desc_job")
    private String descJob;
    private String path;
}
