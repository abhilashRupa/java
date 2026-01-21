package com.nuvyra.learn.concepts.designpatterns;

public class SingletonDemo_1 {

    public static void main(String[] args) {
        LogManagerDemo logManagerDemo1 = LogManagerDemo.getLogManagerDemo();

        System.out.println(logManagerDemo1.hashCode());

        LogManagerDemo logManagerDemo2 = LogManagerDemo.getLogManagerDemo();
        System.out.println(logManagerDemo2.hashCode());
        
    }

}

class LogManagerDemo{

    private static LogManagerDemo logManagerDemo = new LogManagerDemo();

    private LogManagerDemo(){
        System.out.println("instance Created.");
    }

    public static LogManagerDemo getLogManagerDemo(){
        return logManagerDemo;
    }

}
