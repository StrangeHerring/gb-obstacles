package ru.linkov.ss.obstacles.model;

public class Cat implements Runner {

    private String name;
    private boolean successJump;
    private boolean successRun;

    public Cat(String name){
     this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getSuccessJump() {
        return successJump;
    }

    public boolean getSuccessRun() {
        return successRun;
    }

}

