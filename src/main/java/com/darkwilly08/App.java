package com.darkwilly08;

import com.darkwilly08.entrypoints.SchoolManager;

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
    }
}
