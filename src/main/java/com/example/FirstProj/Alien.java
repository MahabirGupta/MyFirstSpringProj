package com.example.FirstProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Marks the Java class, Alien as a Spring component
@Scope(value = "prototype") // to change from singleton class to prototype class
public class Alien {

    private int aid;
    private String aname;
    private String tech;

    @Autowired
    @Qualifier("lapTop") // it can also search by the object name
    private LapTop lapTop; // Use @Autowired To tell SpringBoot that Alien Class needs to get the object from LapTop Class based on the type

//    create a empty constructor

    public Alien() {
        System.out.println("Object created");
    }


//    generate getters and setters

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public LapTop getLapTop() {
        return lapTop;
    }

    public void setLapTop(LapTop lapTop) {
        this.lapTop = lapTop;
    }

    public void show(){
        System.out.println("in show..");
        lapTop.compile();
    }
}
