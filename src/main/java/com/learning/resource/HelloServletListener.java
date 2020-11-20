package com.learning.resource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloServletListener  implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent e) {
        System.out.println("MyServletContextListener Context Initialized");
        e.getServletContext().setAttribute("age",100);
    }

    @Override
    public void contextDestroyed(ServletContextEvent e) {
        System.out.println("MyServletContextListener Context Destroyed");
    }

}
