package ru.linkov.ss.obstacles.model;

public class Robot implements Runner {

    private String name;
    private int length;
    private int height;

    public Robot (String name, int length, int height){
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
        return "Robot{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
