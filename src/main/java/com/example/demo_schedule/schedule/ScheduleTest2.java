package com.example.demo_schedule.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Adam
 * @Description: //TODO
 * @Title: ScheduleTest1
 * @ProjectName demo_schedule
 * @date 2019/6/15 11:52
 */
@Component
public class ScheduleTest2 {
    @Scheduled(cron = "*/1 * * * * ?")
    public void test1(){
        System.out.println("test2 执行");
    }
}
