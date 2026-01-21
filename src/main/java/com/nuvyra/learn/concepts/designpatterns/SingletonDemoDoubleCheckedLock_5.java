package com.nuvyra.learn.concepts.designpatterns;

public class SingletonDemoDoubleCheckedLock_5 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                LogManagerDoubleChecked logManagerDoubleChecked1 = LogManagerDoubleChecked.getLogManagerDoubleChecked();
                System.out.println(logManagerDoubleChecked1.hashCode());
            }
        });

        Thread t2 = new Thread(() -> {
            LogManagerDoubleChecked logManagerDoubleChecked2 = LogManagerDoubleChecked.getLogManagerDoubleChecked();
            System.out.println(logManagerDoubleChecked2.hashCode());
        });

        t1.start();
        t2.start();


    }

}

class LogManagerDoubleChecked{

    private volatile static LogManagerDoubleChecked logManagerDoubleChecked;

    private LogManagerDoubleChecked(){
        System.out.println("instance created");
    }

    public static LogManagerDoubleChecked getLogManagerDoubleChecked(){
        if(logManagerDoubleChecked == null){
            synchronized(LogManagerDoubleChecked.class){
                if(logManagerDoubleChecked == null){
                    logManagerDoubleChecked = new LogManagerDoubleChecked();
                }
            }
        }
        return logManagerDoubleChecked;
    }


}
