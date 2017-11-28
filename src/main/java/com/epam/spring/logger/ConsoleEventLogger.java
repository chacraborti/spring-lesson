package com.epam.spring.logger;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(String msg){
        System.out.println(msg);
    }
}
