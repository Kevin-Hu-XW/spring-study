package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Admin
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        new SpringApplication(App.class).run(args);
    }
}
