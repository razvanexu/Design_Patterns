package org.example.compliant;

public class Sparrow extends CompliantBird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
