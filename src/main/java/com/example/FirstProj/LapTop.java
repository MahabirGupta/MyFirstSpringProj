package com.example.FirstProj;

import org.springframework.stereotype.Component;

@Component
public class LapTop {

    private int lapTopId;
    private String brand;

//    generate getters and setters

    public int getLapTopId() {
        return lapTopId;
    }

    public void setLapTopId(int lapTopId) {
        this.lapTopId = lapTopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void compile(){
        System.out.println("Compiling...");
    }
}
