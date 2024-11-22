package Inheritance_Lecture;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    public Vehicle(){
    // empty constructor
    }
    public Vehicle(String name, String model, int noOfTyres){
        this.name=name;
        this.model=model;
        this.noOfTyres=noOfTyres;
    }
    public void startEngine(){
        System.out.println("engine is starting now");
    }

    public void stopEngine(){
        System.out.println("engine is stopping now");
    }





}
