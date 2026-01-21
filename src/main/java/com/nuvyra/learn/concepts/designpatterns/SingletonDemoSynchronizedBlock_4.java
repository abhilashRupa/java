package com.nuvyra.learn.concepts.designpatterns;

public class SingletonDemoSynchronizedBlock_4 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {

                LogManagerSynchronizedBlock logManagerSynchronizedBlock1 = LogManagerSynchronizedBlock
                        .getLogManagerSynchronized();
                System.out.println(logManagerSynchronizedBlock1.hashCode());

            }

        });

        Thread t2 = new Thread(() -> {
            LogManagerSynchronizedBlock logManagerSynchronizedBlock2 = LogManagerSynchronizedBlock
                    .getLogManagerSynchronized();
            System.out.println(logManagerSynchronizedBlock2.hashCode());
        });

        t1.start();
        t2.start();
    }

}

class LogManagerSynchronizedBlock {

    private LogManagerSynchronizedBlock() {
        System.out.println("instance created");
    }

    private static LogManagerSynchronizedBlock logManagerSynchronizedBlock;

    public static LogManagerSynchronizedBlock getLogManagerSynchronized() {
        synchronized (LogManagerSynchronizedBlock.class) {
            if (logManagerSynchronizedBlock == null) {
                logManagerSynchronizedBlock = new LogManagerSynchronizedBlock();
            }
        }
        return logManagerSynchronizedBlock;
    }

}
