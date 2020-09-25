package ru.linkov.ss.obstacles.repository;

import ru.linkov.ss.obstacles.model.Man;
import ru.linkov.ss.obstacles.model.Robot;

import java.util.Set;

public class RobotRepository {

    private Set<Robot> robots;

    public RobotRepository(Set<Robot> robots){
        this.robots = robots;
    }
    public Robot getRobot(){
        return robots.iterator().next();
    }
}
