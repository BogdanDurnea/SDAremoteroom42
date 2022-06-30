package ro.sda.java42;


import java.util.Date;
import java.util.*;

public class Car {
    private String color;
    private int maxSpeed;
    private String brand;
    private String creationDate;
    private java.sql.Date sqlDate;

    public void setColor(String col) {
        this.color = col;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", color, maxSpeed, brand));
    }

    /**
     * Constructor with arguments
     * @param brand
     * @param color
     * @param maxSpeed
     */
    public Car(String brand,String color,int maxSpeed){
        this.brand = brand;
        this.color=color;
        this.maxSpeed =maxSpeed;
        this.creationDate = String.valueOf(new Date());
    }

    public String getCreationDate(){
        return creationDate;
    }

    public Car(String brand){
        this.brand=brand;
    }

    public Car(String brand, int maxSpeed){
        this.brand=brand;
        this.maxSpeed= maxSpeed;
    }

    public Car(int maxSpeed, String color){
        this.color=color;
        this.maxSpeed=maxSpeed;
    }

    /**
     * DEfault constructor
     */
    public Car(){}
}