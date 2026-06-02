package com.segovia.tutorials.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))") // this takes in that bullshit pointcut expression
    public void log(ProceedingJoinPoint jointPoint) throws Throwable {
        logger.info("Method will execute");
        jointPoint.proceed(); // the jointpoint represents the intercepted method. Proceed actually calls the method.
        logger.info("Method has executed");
    }
}
