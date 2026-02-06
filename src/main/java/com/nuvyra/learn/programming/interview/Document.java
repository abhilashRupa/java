package com.nuvyra.learn.programming.interview;

public class Document {

    private int id;
    private String name;
    private String Type;

    public Document(int id, String name, String type) {
        this.id = id;
        this.name = name;
        Type = type;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }

    

}
