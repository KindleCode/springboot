package com.caiminjie.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Mr Cai on 2018/3/28.
 * @author
 */

@Component
public class ExampleTimer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /** 每10秒执行一次**/
    @Scheduled(fixedRate = 10000)
    public void timerRate() {
        logger.info(" ** fixedRate 运行..");
    }

    /**每天10点54分00秒时执行**/
    @Scheduled(cron = "00 46 10 * * ?")
    public void timerCron() {
        logger.info(" ** crontab 运行 : {}" + new Date());
    }

}
