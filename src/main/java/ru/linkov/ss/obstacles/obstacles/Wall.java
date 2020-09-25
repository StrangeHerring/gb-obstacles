package ru.linkov.ss.obstacles.obstacles;

import ru.linkov.ss.obstacles.model.Runner;

public class Wall {

    private boolean successJump = true;

    public boolean checkSuccessJump(Runner runner) {
        return successJump;
    }
}
