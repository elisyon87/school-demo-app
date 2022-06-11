package com.darkwilly08;

import com.darkwilly08.entrypoints.SchoolManager;
import com.darkwilly08.models.Figura;
import com.darkwilly08.models.Gender;
import com.darkwilly08.models.Person;
import com.darkwilly08.models.Square;
import com.darkwilly08.models.Triangle;

/**
 * School Program!
 */
public final class App {
    private App() {
    }

    /**
     * Manage your school.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        new SchoolManager().start();

        Person student = new Person();
        student.setName("Franco");
        student.setAge(26);
        student.setGender(Gender.MALE);

        Figura cuadrado = new Square();
        if (cuadrado instanceof Square) {
            Square cuadrado2 = (Square) cuadrado;
        }

        cuadrado.setColor("azul");
        // cuadrado.setSideLenght(4); // la F al final le indica que es Float

        System.out.println("el area es: " + cuadrado.getShape());

        Triangle triangulo = new Triangle(18, 4, 9);
        triangulo.setColor("rojo");

        System.out.println("el area es: " + triangulo.getShape());

    }
}
