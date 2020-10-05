package ru.linkov.ss.obstacles.service;

import ru.linkov.ss.obstacles.model.Runner;
import ru.linkov.ss.obstacles.obstacles.Treadmill;
import ru.linkov.ss.obstacles.obstacles.Wall;


public class CheckService {
    private static Wall wall;
    private static Treadmill treadmill;

    public static boolean runCheck(Runner runner, Treadmill treadmill){
        if (runner.getLength() >= treadmill.getLength()){
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " пробежал " + treadmill.getLength());
            return true;
        } else {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " не пробежал " + treadmill.getLength());
            return false;
        }
    }

    public static boolean jumpCheck(Runner runner, Wall wall){
        if (runner.getHeight() >= wall.getHeight()){
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " перепрыгнул " + wall.getHeight());
            return true;
        } else {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " не перепрыгнул " + wall.getHeight());
            return false;
        }
    }
}
