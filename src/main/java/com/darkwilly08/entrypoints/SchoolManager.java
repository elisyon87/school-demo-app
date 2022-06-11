package com.darkwilly08.entrypoints;

import com.darkwilly08.models.Curse;
import com.darkwilly08.models.School;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

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
            System.out.println("3- Agregar alumnos");
            System.out.println("Q- Salir");
            option = keyboard.next().charAt(0);
            switch (option) {
                case '0':
                    showSchoolDetails();
                    break;
                case '1':
                    addCurse();
                    break;
                case '2':
                    System.out.println("Ingrese el numero de curso");
                    int room = keyboard.nextInt();
                    searchCurseDetailsByRoom(room);
                    break;
                case '3':
                    // TODO: search curse and add profesor. submenu maybe?
                    // school.addTeacher(Person person, Curse curse)
                case 'q':
                case 'Q':
                    close();
                    return;
                default:
                    System.out.println("Nothing to do here");
            }

            System.out.print("---------------------\n\n\n");
        }

    }

    private void createSchool() {
        System.out.println("Ingrese el nombre de la escuela");
        String schoolName = keyboard.nextLine();
        this.school = new School(schoolName);
    }

    private void addCurse() {
        showSection("NUEVO CURSO");
        System.out.println("Ingrese el aula");
        int curseRoom = keyboard.nextInt();
        Curse newCurse = new Curse(curseRoom);
        // TODO: add teacher
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
    }

    private void showSection(String sectionName) {
        System.out.print("\n\n");
        System.out.println("----- " + sectionName.toUpperCase() + " -----");
    }

    private void close() {
        keyboard.close();
    }
}
