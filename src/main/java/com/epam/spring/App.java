package com.epam.spring;

import com.epam.spring.beans.Client;
import com.epam.spring.logger.EventLogger;

public class App {
    Client client;
    EventLogger eventLogger;

    public App(Client client, EventLogger consoleEventLogger) {
        this.client = client;
        this.eventLogger = consoleEventLogger;
    }

    public void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();

        app.logEvent("1A3A4GG11");
    }
}
