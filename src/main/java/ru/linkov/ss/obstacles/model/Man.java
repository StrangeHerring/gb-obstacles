package ru.linkov.ss.obstacles.model;

public class Man implements Runner {

    private String name;
    private int length;
    private int height;

    public Man (String name, int length, int height){
        this.name = name;
        this.height = height;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}

