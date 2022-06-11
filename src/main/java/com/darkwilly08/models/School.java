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

}
