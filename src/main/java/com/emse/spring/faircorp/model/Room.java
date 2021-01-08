package com.emse.spring.faircorp.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable =false)
    private int floor;

    @Column(nullable=false, length=255)
    private String name;

    @Column
    private Double currentTemperature;

    @Column
    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private java.util.List<Window> windowList;

    @OneToMany(mappedBy="room")
    private List<Heater> heaterList;

    public Room() {
    }

    public Room(int floor, String name, Double temperature, Double currentTemperature) {
        this.floor=floor;
        this.name= name;
        this.currentTemperature=currentTemperature;
        this.targetTemperature=targetTemperature;
        this.windowList=windowList;
        this.heaterList=heaterList;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentTemperature(){
        return this.currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature){
        this.currentTemperature=currentTemperature;
    }

    public Double getTargetTemperature(){
        return this.targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature){
        this.targetTemperature=targetTemperature;
    }

    public java.util.List<Window> getWindows(){
        return this.windowList;
    }
    public void setWindows(java.util.List<Window> windowList){
        this.windowList = windowList;
    }

    public java.util.List<Heater> getHeaters() {
        return heaterList;
    }

    public void setHeaters(java.util.List<Heater> heaterList) {
        this.heaterList = heaterList;
    }
}
