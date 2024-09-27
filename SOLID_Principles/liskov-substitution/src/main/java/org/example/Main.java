package org.example;

import org.example.compliant.CompliantBird;
import org.example.compliant.Ostrich;
import org.example.compliant.Sparrow;
import org.example.non_compliant.Bird;
import org.example.non_compliant.Penguin;
import org.example.shapes.Rectangle;
import org.example.shapes.Shape;
import org.example.shapes.Square;

public class Main {
    public static void main(String[] args) {
        //non-compliant code
        Bird bird = new Bird();
        bird.fly();

        Bird penguin = new Penguin();
       // penguin.fly();

        //compliant code
        System.out.println("\n"+"compliant\n");

        Sparrow sparrow = new Sparrow();
        Ostrich ostrich = new Ostrich();

        sparrow.eat();
        sparrow.fly();
        ostrich.eat();

        System.out.println("/n" + "Area\n");

        Shape rect = new Rectangle(5, 3);
        Shape square = new Square(3);

        System.out.println("rectangle area = " + rect.getArea());
        System.out.println("square area = " + square.getArea());


    }
}