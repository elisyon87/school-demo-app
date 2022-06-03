package com.darkwilly08.models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Curse> curses;
    private String name;

    public School(String name) {
        this.name = name;
        curses = new ArrayList<Curse>();
    }

    public String getName() {
        return name;
    }

    public List<Curse> getCurses() {
        return curses;
    }

    public void setCurses(List<Curse> curses) {
        this.curses = curses;
    }
}
