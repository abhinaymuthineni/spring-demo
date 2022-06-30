package com.abhinay.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopClass {
    private static final Logger logger = LoggerFactory.getLogger(AopClass.class);

    @Before("execution(* com.abhinay.demo.services.*.delete*(..))")
    public void executeBeforeTheDeleteOperationIsPerformed(){
        logger.info(" >> Deleting from database. ");
    }

    @Before("execution(* com.abhinay.demo.services.*.save*(..))")
    public void executeBeforeTheSavingOperationIsPerformed(){
        logger.info(" >> Saving to the database. ");
    }

    @Before("execution(* com.abhinay.demo.controller.*.*Update(..))")
    public void executeBeforeTheUpdateOperationIsPerformed(){
        logger.info(" >> Updating to the database. ");
    }

    @Before("execution(* com.abhinay.demo.services.*.list*(..))")
    public void abc() {
        logger.info(" >> List is being displayed.");
    }
}
