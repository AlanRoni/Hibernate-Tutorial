package com.alan.learning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class student {
    @Id
    private int roll;
    private String sname;
    private int marks;
    @OneToOne
    private laptop lap;

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return sname;
    }
    public void setName(String name) {
        this.sname = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public laptop getL() {
        return lap;
    }

    public void setL(laptop l) {
        this.lap = l;
    }
}
