package com.github.thushear.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kongming on 2016/4/9.
 */
public class SLF4JTest {


    private Logger logger = LoggerFactory.getLogger(SLF4JTest.class.getSimpleName());


    public SLF4JTest() {

    }

    public void testLogger(){
        logger.info("hello {} and {}","world","slf4j");
    }


    public static void main(String[] args) {

        new SLF4JTest().testLogger();

    }


}
