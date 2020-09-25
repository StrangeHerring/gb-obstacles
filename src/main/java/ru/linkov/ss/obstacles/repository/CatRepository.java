package ru.linkov.ss.obstacles.repository;

import ru.linkov.ss.obstacles.model.Cat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CatRepository {

    ArrayList<Cat> cats = new ArrayList<Cat>();

    cats.add("s");

    public Cat getCat(){
        return cats.iterator().next();
    }
}
