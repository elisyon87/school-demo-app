package com.darkwilly08.models;

import java.util.ArrayList;
import java.util.List;

public class Curse {
    private List<Person> students;
    private Person teacher;
    private int room;

    public Curse(int room) {
        this.room = room;
        this.students = new ArrayList<Person>();
    }

    public int getRoom() {
        return room;
    }

    public Person getTeacher() {
        return teacher;
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }

    public void addStudent(Person student) {
        this.students.add(student);
    }
}
