package com.nuvyra.learn.concepts.designpatterns.factory.abstract_class_approach;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){

        if("PC".equalsIgnoreCase(type)){
            return new PC(ram, hdd, cpu);
        }else if ("server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }else{
            return null;
        }

    }

}
