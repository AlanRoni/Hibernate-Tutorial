// package com.alan.learning;

// import java.util.ArrayList;
// import java.util.List;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;

// @Entity
// public class laptop {
//     @Id
//     private int lid;
//     private String lapname;
//     @ManyToMany
//     private List<student> Student = new ArrayList<>();
//     public int getId() {
//         return lid;
//     }
//     public void setId(int id) {
//         this.lid = id;
//     }
//     public String getLapname() {
//         return lapname;
//     }
//     public void setLapname(String lapname) {
//         this.lapname = lapname;
//     }

//     public List<student> getStudent() {
//         return Student;
//     }

//     public void setStudent(List<student> Student) {
//         this.Student = Student;
//     }
// }