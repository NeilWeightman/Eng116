package com.sparta.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDriver {
    public static Logger logger = LogManager.getLogger("Logger");
    public static void main(String[] args) {
        logger.info("This is an info message");
        try{
            int x = 1;
            int y = 0;
            int z = x / y;
        } catch (ArithmeticException e) {
            logger.error("ERROR!!!", e);
        }
        System.out.println("This is standard out");
    }
}
