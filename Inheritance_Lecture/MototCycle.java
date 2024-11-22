package Inheritance_Lecture;

public class MototCycle extends Vehicle{
    public String handleBarStyle;
    public String suspensionType;

    public MototCycle(){
        // empty constructor
    }
    public MototCycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle=handleBarStyle;
        this.suspensionType=suspensionType;
    }


    public void handleBarStyle(){
        System.out.println("handling bar style");
    }

    public void suspensionType(){
        System.out.println("suspensionTyres method");
    }





}
