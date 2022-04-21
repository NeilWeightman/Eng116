package com.sparta.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondLogExample {
    public static Logger logger = LogManager.getLogger("2nd Example");
    public static void main(String[] args) {
        logger.warn("Hello from second logger");
    }
}
