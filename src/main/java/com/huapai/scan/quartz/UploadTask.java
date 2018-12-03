package com.huapai.scan.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
@DisallowConcurrentExecution //不要并发
public class UploadTask  extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("任务开始");
        try {
            System.out.println("----------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("任务结束");
    }


}
