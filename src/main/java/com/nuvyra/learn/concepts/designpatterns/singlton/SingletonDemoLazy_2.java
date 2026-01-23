package com.nuvyra.learn.concepts.designpatterns.singlton;

public class SingletonDemoLazy_2 {
    public static void main(String[] args) {
        LogManagerDemoLazy logManagerDemoLazy1 = LogManagerDemoLazy.getLogManagerDemo();
        System.out.println(logManagerDemoLazy1.hashCode());

        LogManagerDemoLazy logManagerDemoLazy2 = LogManagerDemoLazy.getLogManagerDemo();
        System.out.println(logManagerDemoLazy2.hashCode());
        
    }

}

class LogManagerDemoLazy {

    private static LogManagerDemoLazy logManagerDemoLazy;

    private LogManagerDemoLazy(){
        System.out.println("instance created.");
    }

    public static LogManagerDemoLazy getLogManagerDemo(){
        if(logManagerDemoLazy == null) {
            logManagerDemoLazy = new LogManagerDemoLazy();    
        }
        return logManagerDemoLazy;
        
    }

}
