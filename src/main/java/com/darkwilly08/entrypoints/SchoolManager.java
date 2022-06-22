package com.darkwilly08.entrypoints;

import com.darkwilly08.models.Curse;
import com.darkwilly08.models.Person;
import com.darkwilly08.models.School;

import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.Set;

import javax.lang.model.element.Name;

public class SchoolManager {
    private static final int COLUMN_SIZE = 20;
    private School school;
    private Scanner keyboard;

    public SchoolManager() {
        keyboard = new Scanner(System.in);
    }

    public void start() {
        createSchool();
        showMenu();
    }

    private void showMenu() {
        char option = 'q';

        while (true) {
            System.out.println("0- Ver detalle");
            System.out.println("1- Agregar curso");
            System.out.println("2- Buscar curso");
            System.out.println("3- Agregar profesores");
            System.out.println("4- Ver listado de profesores");
            System.out.println("Q- Salir");
            option = keyboard.nextLine().charAt(0);
            switch (option) {
                case '0':
                    showSchoolDetails();
                    break;
                case '1':
                    addCurse();
                    break;
                case '2':
                    System.out.println("Ingrese el numero de curso");
                    int room = Integer.parseInt(keyboard.nextLine());
                    searchCurseDetailsByRoom(room);
                    break;
                case '3':
                    System.out.println("Ingrese el numero de curso");
                    int room2 = Integer.parseInt(keyboard.nextLine());
                    addTeacher(room2);
                    break;
                // TODO: search curse and add profesor. submenu maybe?
                // school.addTeacher(Person person, Curse curse)
                case '4':
                    showProfesorDetails();
                    break;
                case 'q':
                case 'Q':
                    close();
                    return;
                default:
                    System.out.println("Nothing to do here");
            }

        }

        // System.out.print("---------------------\n\n\n");

    }

    private void createSchool() {
        System.out.println("Ingrese el nombre de la escuela");
        String schoolName = keyboard.nextLine();
        this.school = new School(schoolName);
    }

    private void addCurse() {
        showSection("NUEVO CURSO");
        System.out.println("Ingrese el aula");
        int curseRoom = Integer.parseInt(keyboard.nextLine());
        Curse newCurse = new Curse(curseRoom);
        this.school.getCurses().add(newCurse);
    }

    private void showSchoolDetails() {
        showSection("DETALLES DEL COLEGIO");
        System.out.print(StringUtils.rightPad("NOMBRE", COLUMN_SIZE));
        System.out.println(school.getName());
        System.out.print(StringUtils.rightPad("CURSOS", COLUMN_SIZE));
        System.out.println(school.getCurses().size());
    }

    private void searchCurseDetailsByRoom(int room) {
        Curse curse = school.getCurseByRoom(room);
        if (curse == null) {
            System.out.println("el curso ingresado no existe");
            return;
        }

        System.out.println("el curso es " + curse.getRoom());

        if (curse.getTeacher() == null) {
            System.out.println("el curso aun no tiene profesor asignado");
            return;
        }

        System.out.println("el profesor es " + curse.getTeacher().getName());
    }

    private void addTeacher(int room) {

        showSection("NUEVO PROFESOR");
        System.out.println("Ingrese la edad del profesor");

        int age = Integer.parseInt(keyboard.nextLine()); // toma el enter en esta linea asi no lo toma el proximo
                                                         // scan
        System.out.println("Ingrese el nombre del profesor");
        String name = keyboard.nextLine();
        Person teacher = new Person(age, name);

        try {
            school.addTeacher(teacher, room);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    private void showSection(String sectionName) {
        System.out.print("\n\n");
        System.out.println("----- " + sectionName.toUpperCase() + " -----");
    }

    private void showProfesorDetails() {
        showSection("LISTADO DE PROFESORES");
        System.out.print(StringUtils.rightPad("Profesor", COLUMN_SIZE));
        System.out.println(StringUtils.rightPad("Aula", COLUMN_SIZE));

        school.orderCursesByTeacherNameAndRoom(); // TODO ordenar la lista original

        // for (Curse curse : school.getCurses()) {

        // }

        for (int i = 0; i < school.getCurses().size(); i++) {
            Curse curse = school.getCurses().get(i);
            System.out.print(StringUtils.rightPad(curse.getTeacher().getName(), COLUMN_SIZE));
            System.out.println(StringUtils.rightPad(String.valueOf(curse.getRoom()), COLUMN_SIZE));
        }

        // System.out.print(StringUtils.rightPad("NOMBRE", COLUMN_SIZE));
        // System.out.println(school.getName());
        // System.out.print(StringUtils.rightPad("CURSOS", COLUMN_SIZE));
        // System.out.println(school.getCurses().size());
    }

    private void close() {
        keyboard.close();
    }
}
