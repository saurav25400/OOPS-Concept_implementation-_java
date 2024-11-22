package Ploymorphism_Example;

public class Main {
    static void dynamicMethodDispatchExample(Shape s){
        s.draw(); // the decision to call the type of draw method from different class is decided at run time.
        Circle c=(Circle)s;     // downcasting parent object to child class reference variable.
        c.roast(); // so there is disadvantage of down casting in case if any of the child class object don't have that particular method.

    }
    public static void main(String[] args) {
        Shape s=new Shape();
       // s.draw();
        Circle c=new Circle();
       // c.draw();
        Rect rect=new Rect();

        dynamicMethodDispatchExample(rect);





    }
}
