package Inheritance_Lecture;

public class Main {
    public static void main(String[] args) {
        Car c=new Car("fortuner","f8",4,4,"first");
        c.startEngine();
        c.startAce();
        c.stopEngine();

        MototCycle mototCycle=new MototCycle("splender","80",2,"normal","rigid");

          mototCycle.startEngine();
          mototCycle.suspensionType();
          mototCycle.stopEngine();

    }
}
