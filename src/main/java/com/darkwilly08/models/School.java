package com.darkwilly08.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.darkwilly08.comparators.CurseComparator;

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

    public void addTeacher(Person teacher, int room) throws Exception {
        Curse curse = this.getCurseByRoom(room);

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        if (curse == null) {
            throw new Exception("curse " + room + " not found");
        }

        curse.setTeacher(teacher);

    }

    public void orderCursesByTeacherNameAndRoom() {

        Collections.sort(curses, new CurseComparator());

    }

}
