package com.alan.learning;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class laptop implements List<laptop> {
    @Id
    private int lid;
    private String lapname;

    public int getId() {
        return lid;
    }
    public void setId(int id) {
        this.lid = id;
    }
    public String getLapname() {
        return lapname;
    }
    public void setLapname(String lapname) {
        this.lapname = lapname;
    }
}
