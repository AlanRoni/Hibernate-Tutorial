// package com.alan.learning;

// import java.util.ArrayList;
// import java.util.List;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;

// @Entity
// public class student {
//     @Id
//     private int roll;
//     private String sname;
//     private int marks;
//     @OneToMany
//     private List<laptop> lap = new ArrayList<>();

//     public int getRoll() {
//         return roll;
//     }
//     public void setRoll(int roll) {
//         this.roll = roll;
//     }
//     public String getName() {
//         return sname;
//     }
//     public void setName(String name) {
//         this.sname = name;
//     }
//     public int getMarks() {
//         return marks;
//     }
//     public void setMarks(int marks) {
//         this.marks = marks;
//     }

//     public List<laptop> getL() {
//         return lap;
//     }

//     public void setL(List<laptop> l) {
//         this.lap = l;
//     }
// }
