package com.darkwilly08.models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Curse> curses;
    private String name;
    private Person teacher;

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

    public Curse getCurseByRoom(int room) {
        // Curse matchedCurse = null;

        // for (int i = 0; i <= curses.size(); i++) {
        // Curse curse = curses.get(i);

        // if (room == curse.getRoom()) {
        // matchedCurse = curse;
        // break;
        // }
        // }

        return curses.stream().filter(c -> room == c.getRoom())
                .findAny()
                .orElse(null);

        // return matchedCurse;
    }

    public void addTeacher(Person teacher) {
        this.teacher.add(teacher); //no tendria que ser una lista teacher tambien?
                                //me creo teacher aca como quick fix porque no le gustaba,
                                //no tomo el que estaba en curses
}
