package com.k8s.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date 2022/11/9 22:19
 */
@RestController
@RequestMapping("service-one")
@Slf4j
public class TestController {

    @RequestMapping(value = "hello", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object users() {
        log.info("hello service one: {}", System.currentTimeMillis());
        return "hello service one";
    }

}
