package mta.se.lab.basic;

import mta.se.lab.basic.exceptions.SingException;
import mta.se.lab.basic.interfaces.ISinger;
import mta.se.lab.basic.student.CivilStudent;
import mta.se.lab.basic.student.MilitaryStudent;
import mta.se.lab.basic.student.Student;

/**
 * Created by John on 26/10/2014.
 *
 * This the main class of the project. It is also the entry point of the application.
 */
public class Main {

    /**
     * The entry point to the project
     *
     * @param args  The arguments to the executable
     */
    public static void main(String[] args) {
        ISinger singingStudent = new MilitaryStudent("John");
        Student civilStudent = new CivilStudent("Jack");
        MilitaryStudent militaryStudent = new MilitaryStudent(null);
        Student normalStudent = new MilitaryStudent(null);

        try {
            singingStudent.sing();
        } catch (SingException e) {
            System.out.println("Exception while signing: " + e.getMessage());
        }

        try {
            ((ISinger) civilStudent).sing();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            militaryStudent.sing();
        } catch (SingException e) {
            System.out.println("Exception while signing: " + e.getMessage());
        }

        militaryStudent.setName("Lt George");
        System.out.println("Is he an officer?\n" + (militaryStudent.isOfficer() ? "Yes!" : "No!"));

        try {
            ((MilitaryStudent) normalStudent).sing();
        } catch (SingException e) {
            System.out.println("Exception while signing: " + e.getMessage());
        }

        // The implementation of setName from the MilitaryStudent class is called
        normalStudent.setName("Slt Mary");
        System.out.println("Is she an officer?\n" + (((MilitaryStudent) normalStudent).isOfficer() ? "Yes!" : "No!"));
    }
}
