package com.maple.smaple.util;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: hanyu
 * @Description:设置controller全局日志打印
 * @copyright @hanyu
 * @Date: Create in  2020/4/3 23:34
 */

@Component
@Aspect
public class LoggerUtil {
    @Before("execution(* com.maple.smaple.controller.GreetingController.*(..))")
    public void before(){
        System.out.println("日志");
    }
}
