package ru.linkov.ss.obstacles.repository;

import ru.linkov.ss.obstacles.model.Cat;
import ru.linkov.ss.obstacles.model.Man;

import java.util.Set;

public class ManRepository {

    private Set<Man> mans;

    public ManRepository(Set<Man> mans){
        this.mans = mans;
    }
    public Man getMan(){
        return mans.iterator().next();
    }
}
