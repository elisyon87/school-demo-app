package com.darkwilly08.comparators;

import java.util.Comparator;

import com.darkwilly08.models.Curse;

public class CurseComparator implements Comparator<Curse> {

    @Override
    public int compare(Curse o1, Curse o2) {
        if (o1.getTeacher().getName() != o2.getTeacher().getName()) {
            return o1.getTeacher().getName().compareTo(o2.getTeacher().getName());
        }

        if (o1.getRoom() != o2.getRoom()) {
            return Integer.compare(o1.getRoom(), o2.getRoom());
        }

        return 0;
    }

}
