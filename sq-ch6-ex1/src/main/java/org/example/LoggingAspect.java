package org.example;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.example..*(..))")
    public void log(ProceedingJoinPoint joinPoint) {
        try {
            logger.info("Methos will execute");
            joinPoint.proceed();
            logger.info("Method executed");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
