package mta.se.lab.basic.student;

/**
 * Created by John on 27/10/2014.
 *
 * This is the abstract student class
 */
public abstract class Student {

    /* The name of the student */
    private String mName;

    /**
     * The default constructor that initializes the student with the given name
     * @param name  The name of the student
     */
    public Student(String name) {
        this.mName = name;
    }

    /**
     * This method must be overwritten by all the subclasses
     *
     * @param courseName    The name of the course
     * @return  <code>True</code> if the student is attending the course, <code>False</code> otherwise
     */
    public abstract boolean attendingCourse(String courseName);

    /**
     * Sets the name of the student
     * @param name  The name of the student
     */
    public void setName(String name) {
        this.mName = name;
    }

    /**
     * Gets the name of the student
     * @return  The name of the student
     */
    public String getName() {
        return mName;
    }
}
