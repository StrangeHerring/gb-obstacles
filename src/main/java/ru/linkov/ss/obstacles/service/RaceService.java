package ru.linkov.ss.obstacles.service;

import ru.linkov.ss.obstacles.model.Runner;
import ru.linkov.ss.obstacles.obstacles.Treadmill;
import ru.linkov.ss.obstacles.obstacles.Wall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RaceService {

    public static List<Runner> run(Collection<Runner> runners, Collection<Treadmill> treadmills) {
        List<Runner> actualResult = new ArrayList<>(runners);

        for (Treadmill treadmill : treadmills) {
            Iterator<Runner> iterator = actualResult.iterator();
            while (iterator.hasNext()) {
                Runner runner = iterator.next();
                boolean isPassed = CheckService.runCheck(runner, treadmill);
                if (!isPassed) {
                    iterator.remove();
                }
            }
        }

        return actualResult;
    }

    public static List<Runner> jump(Collection<Runner> runners, Collection<Wall> walls) {
        List<Runner> actualResult = new ArrayList<>(runners);

        for (Wall wall : walls) {
            Iterator<Runner> iterator = actualResult.iterator();
            while (iterator.hasNext()) {
                Runner runner = iterator.next();
                boolean isPassed = CheckService.jumpCheck(runner, wall);
                if (!isPassed) {
                    iterator.remove();
                }
            }
        }

        return actualResult;
    }

}
