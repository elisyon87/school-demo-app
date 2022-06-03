package com.darkwilly08.models;

import org.apache.commons.lang3.StringUtils;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    Person() {
        gender = Gender.NOT_INFORMED;
    }

    void setName(String name) {
        if (!StringUtils.isBlank(name)) {
            this.name = StringUtils.capitalize(name.toLowerCase());
        }

    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
