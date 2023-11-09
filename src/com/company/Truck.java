package com.company;

public class Truck extends Vehicle{
 private int weight;

    public Truck(String make, String model, int yearOfProduction, int weight) {
        super(make, model, yearOfProduction);
        this.weight = weight;
    }

    @Override
    public void drive(double speed) {
        System.out.println("Driving at"+speed);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
