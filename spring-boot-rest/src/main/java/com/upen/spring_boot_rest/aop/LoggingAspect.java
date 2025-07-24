package com.upen.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution (* com.upen.spring_boot_rest.service.JobService.getJob*(..)) || execution(* com.telusko.springbootrest.service.JobService.updateJob*(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called "+jp.getSignature().getName());
    }



    @After("execution (* com.upen.spring_boot_rest.service.JobService.getJob*(..)) || execution(* com.telusko.springbootrest.service.JobService.updateJob*(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed "+jp.getSignature().getName());
    }


    @AfterThrowing("execution (* com.upen.spring_boot_rest.service.JobService.getJob*(..)) || execution(* com.upen.spring_boot_rest.service.JobService.updateJob*(..))")
    public void logMethodCrashed(JoinPoint jp) {
        LOGGER.info("Method has some issues "+jp.getSignature().getName());
    }
}
