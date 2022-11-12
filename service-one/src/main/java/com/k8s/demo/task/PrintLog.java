package com.k8s.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Date 2022/11/9 22:16
 */
@Component
@Slf4j
public class PrintLog {

    @Scheduled(fixedRate = 1000L)
    public void printLog() {
        log.info("我要打印日志看看：{}", System.currentTimeMillis());
    }

}
