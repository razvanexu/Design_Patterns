package org.example.non_compliant;

public class Penguin extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
