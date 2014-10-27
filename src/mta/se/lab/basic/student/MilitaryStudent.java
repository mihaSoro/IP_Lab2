package mta.se.lab.basic.student;

import mta.se.lab.basic.exceptions.SingException;
import mta.se.lab.basic.interfaces.ISinger;

/**
 * Created by John on 27/10/2014.
 *
 * This is the class for a military student
 */
public class MilitaryStudent extends Student implements ISinger {

    private boolean isOfficer = false;

    public MilitaryStudent(String name) {
        super(name);
        checkIfOfficer();
    }

    public MilitaryStudent(String name, String rank) {
        super(rank + " " + name);
        checkIfOfficer();
    }

    @Override
    public boolean attendingCourse(String courseName) {
        return courseName!=null && (courseName.startsWith("Mil"));
    }

    @Override
    public void sing() throws SingException {
        if (getName() == null)
            throw new SingException("The name of the student is invalid");

        System.out.println(getName() + " is signing the anthem");
    }

    @Override
    public void setName(String name) {
        super.setName(name);

        checkIfOfficer();
    }

    private void checkIfOfficer() {
        isOfficer = getName() != null && (getName().startsWith("Slt") || getName().startsWith("Lt"));
    }

    public boolean isOfficer() {
        return isOfficer;
    }
}
