package com.example.demo.manager;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleTest {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 6000)
    public void reportFixedRateCurrentTime() {
        System.out.println("上一次开始执行时间点之后6秒再执行, 现在时间：" + dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay  = 6000)
    public void reportFixedDelayCurrentTime() {
        System.out.println("上一次执行完毕时间点之后6秒再执行, 现在时间：" + dateFormat.format(new Date()));
    }

    @Scheduled(initialDelay=3000, fixedRate=6000)
    public void reportInitialDelayCurrentTime() {
        System.out.println("第一次延迟1秒后执行，之后按 fixedRate 的规则每6秒执行一次, 现在时间：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "10 * * * * *")
    public void reportCronCurrentTime() {
        System.out.println("cron, 现在时间：" + dateFormat.format(new Date()));
    }
}
