package mta.se.lab.basic.student;

import mta.se.lab.basic.interfaces.ISinger;

/**
 * Created by John on 27/10/2014.
 *
 * This the class for a "normal" student
 */
public class CivilStudent extends Student implements ISinger {

    public CivilStudent(String name) {
        super(name);
    }

    @Override
    public void sing() {
        if (getName() == null) {
            System.out.println("Invalid student name handled. No singing today!");
            return;
        }

        System.out.println(getName() + " is singing Lady Gaga");
    }

    @Override
    public boolean attendingCourse(String courseName) {
        return courseName != null && !(courseName.startsWith("Mil"));
    }
}
