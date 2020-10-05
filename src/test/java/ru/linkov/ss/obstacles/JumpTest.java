package ru.linkov.ss.obstacles;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.linkov.ss.obstacles.model.Cat;
import ru.linkov.ss.obstacles.model.Man;
import ru.linkov.ss.obstacles.model.Robot;
import ru.linkov.ss.obstacles.model.Runner;
import ru.linkov.ss.obstacles.obstacles.Treadmill;
import ru.linkov.ss.obstacles.obstacles.Wall;
import ru.linkov.ss.obstacles.service.CheckService;
import ru.linkov.ss.obstacles.service.RaceService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class JumpTest {
    CheckService checkService = new CheckService();
    RaceService raceService = new RaceService();

    @Test
    void testJump(){
        ArrayList<Runner> runners = new ArrayList<>();
        ArrayList<Wall> walls = new ArrayList<>();
        ArrayList<Runner> expectedResult = new ArrayList<>();

        Robot c3po = new Robot("c3po", 5, 6);
        Robot r2d2 = new Robot("r2d2", 2, 4);

        Man greg = new Man("greg",2,2);
        Man bill = new Man("bill", 7,4);

        Cat bob = new Cat("bob", 2, 2);
        Cat mag = new Cat("mag", 3, 1);
        Cat jan = new Cat("jan", 5, 3);

        Wall shortWall = new Wall(3);
        Wall longWall = new Wall(6);

        runners.add(c3po);
        runners.add(r2d2);
        runners.add(greg);
        runners.add(bill);
        runners.add(bob);
        runners.add(mag);
        runners.add(jan);
        walls.add(shortWall);
        walls.add(longWall);
        expectedResult.add(runners.get(1));
        expectedResult.add(runners.get(1));

        List<Runner> actual = RaceService.jump(runners, walls);

        Assert.assertEquals(actual, expectedResult);
    }
}

