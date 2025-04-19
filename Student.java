/ Student.java


package com.studentdata;

/**
 * Student entity class.
 */

public class Student {
private String prn;
    private String name;
    private String dob;
    private double marks;

    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

public String getPrn() { return prn; }
    public String getName() { return name; }
    public String getDob() { return dob; }
    public double getMarks() { return marks; }



}
