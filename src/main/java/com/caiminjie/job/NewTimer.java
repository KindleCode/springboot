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
public class NewTimer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**第一次延迟1秒执行，当执行完后2秒再执行**/
    @Scheduled(initialDelay = 1000, fixedDelay = 2000)
    public void timerInit() {
        logger.info(" ** delay : {}" + new Date());
    }
}
