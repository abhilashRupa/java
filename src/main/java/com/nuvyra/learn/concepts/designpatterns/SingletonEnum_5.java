package com.nuvyra.learn.concepts.designpatterns;

public class SingletonEnum_5 {

    public static void main(String[] args) {
        LogManagerEnum logManagerEnum1 = LogManagerEnum.INSTANCE;
        LogManagerEnum logManagerEnum2 = LogManagerEnum.INSTANCE;

        System.out.println(logManagerEnum1.hashCode());
        System.out.println(logManagerEnum2.hashCode());

        logManagerEnum1.i = 10;
        logManagerEnum1.show();

        logManagerEnum2.i = 20;
        logManagerEnum2.show();

    }

}

enum LogManagerEnum {
    INSTANCE;

    int i;

    public void show() {
        System.out.println(i);
    }
}
