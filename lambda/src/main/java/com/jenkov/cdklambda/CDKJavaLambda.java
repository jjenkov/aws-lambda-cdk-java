package com.jenkov.cdklambda;

import java.util.Map;

public class CDKJavaLambda {

    static String message = System.getenv("message");

    public CDKJavaLambda() {
        System.out.println("CDKLambda initialized");
        System.out.println("Configuration:");
        System.out.println(message);
    }

    public String onEvent(Map<String, String> event) {
        System.out.println("CDKLambda called");
        System.out.println("Event: " + event.toString());

        return "{ \"message\" : \"Response from CDKLambda\"}" ;
    }


}