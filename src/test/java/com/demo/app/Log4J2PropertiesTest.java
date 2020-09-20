package com.demo.app;

import org.junit.jupiter.api.Test;

import com.demo.business.Log4J2Business;
import com.demo.service.Log4J2Service;

public class Log4J2PropertiesTest {
    @Test
    public void testPerformSomeTask() throws Exception {
        Log4J2Service log4J2Service=new Log4J2Service();
        log4J2Service.performSomeTask();
        Log4J2Business log4J2Business = new Log4J2Business();
        log4J2Business.performSomeTask();
    }
}