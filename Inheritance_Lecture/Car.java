package Inheritance_Lecture;

public class Car extends Vehicle{
    public int noOfDoors;
    public String TransmissionTyres;

    public Car(){
        // empty constructor
    }
    public Car(String name, String model, int noOfTyres, int noOfDoors, String TransmissionTyres){
        super(name,model,noOfTyres);
        this.noOfDoors=noOfDoors;
        this.TransmissionTyres=TransmissionTyres;
    }

    public void startAce(){
        System.out.println("ac is starting now");
    }



}
