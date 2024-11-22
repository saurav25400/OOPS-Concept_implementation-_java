package Ploymorphism_Example;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("circle class draw method");
    }
    public void roast(){
        System.out.println("roast method");
    }

}
