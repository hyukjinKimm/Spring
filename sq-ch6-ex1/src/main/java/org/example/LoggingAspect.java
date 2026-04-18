package org.example;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value="@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) {
        try {
            logger.info("Logging Aspect: Calling the intercepted method");

            Object retunredValue = joinPoint.proceed();
            logger.info("Logging Aspect: Method executed and returned " + retunredValue);
            return retunredValue;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @AfterReturning(value = "@annotation(AfterLog)", returning = "returnedValue")
    public void afterlog(Object returnedValue) {
        logger.info("Method After Log " + returnedValue);
    }
}
