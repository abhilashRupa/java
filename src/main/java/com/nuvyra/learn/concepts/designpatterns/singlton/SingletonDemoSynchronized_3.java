package com.nuvyra.learn.concepts.designpatterns.singlton;

public class SingletonDemoSynchronized_3 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                LogManagerSynchronized logManagerSynchronized1 = LogManagerSynchronized.getLogManagerSynchronized();
                System.out.println(logManagerSynchronized1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                LogManagerSynchronized logManagerSynchronized2 = LogManagerSynchronized.getLogManagerSynchronized();
                System.out.println(logManagerSynchronized2.hashCode());
            }
        });

        t1.start();
        t2.start();

    }

}

class LogManagerSynchronized {

    private static LogManagerSynchronized logManagerSynchronized;

    private LogManagerSynchronized() {
        System.out.println("instance created");
    }

    public static synchronized LogManagerSynchronized getLogManagerSynchronized() {
        if (logManagerSynchronized == null) {
            logManagerSynchronized = new LogManagerSynchronized();
        }

        return logManagerSynchronized;

    }
}
