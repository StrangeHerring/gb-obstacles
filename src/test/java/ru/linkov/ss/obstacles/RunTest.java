package ru.linkov.ss.obstacles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.linkov.ss.obstacles.model.Cat;
import ru.linkov.ss.obstacles.model.Man;
import ru.linkov.ss.obstacles.model.Robot;
import ru.linkov.ss.obstacles.model.Runner;
import ru.linkov.ss.obstacles.obstacles.Treadmill;
import ru.linkov.ss.obstacles.service.RaceService;

import java.util.ArrayList;
import java.util.List;

public class RunTest {
    @Test
    void testRun(){

        ArrayList<Cat> cats = getCats();
        ArrayList<Robot> robots = getRobots();
        ArrayList<Man> mans = getMans();
        ArrayList<Treadmill> treadmills = getTreadmills();
        ArrayList<Runner> expectedResult = new ArrayList<>();
        expectedResult.add(robots.get(2));
        expectedResult.add(mans.get(2));

        ArrayList<Runner> runners = getRunners(cats, robots, mans);

        List<Runner> actual = RaceService.run(runners, treadmills);

        Assertions.assertEquals(actual, expectedResult);

    }


    private ArrayList<Treadmill> getTreadmills() {
        ArrayList<Treadmill> treadmills = new ArrayList<Treadmill>();
        treadmills.add(new Treadmill(5));
        treadmills.add(new Treadmill(10));
        return treadmills;
    }

    private ArrayList<Cat> getCats() {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Barsik", 2, 0));
        cats.add(new Cat("Holly", 6, 0));
        cats.add(new Cat("Molly", 11, 0));
        return cats;
    }

    private ArrayList<Man> getMans() {
        ArrayList<Man> mans = new ArrayList<Man>();
        mans.add(new Man("Pasha", 2, 0));
        mans.add(new Man("Sveta", 6, 0));
        mans.add(new Man("Nina", 11, 0));
        return mans;
    }

    private ArrayList<Robot> getRobots() {
        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(new Robot("R2D2", 2, 0));
        robots.add(new Robot("R2D3", 6, 0));
        robots.add(new Robot("R2D4", 11, 0));
        return robots;
    }

    private ArrayList<Runner> getRunners(ArrayList<Cat> cats, ArrayList<Robot> robots, ArrayList<Man> mans) {
        ArrayList<Runner> runners = new ArrayList<Runner>();
        runners.addAll(cats);
        runners.addAll(robots);
        runners.addAll(mans);
        return runners;
    }

    private ArrayList<Boolean> getBooleans() {
        ArrayList<Boolean> expectedResult = new ArrayList<Boolean>();
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(true);
        return expectedResult;
    }
}