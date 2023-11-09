package com.company;

abstract public class Vehicle implements Comparable <Vehicle>{

    private String make;

    private String model;
    private int yearOfProduction;


    public Vehicle(String make, String model, int yearOfProduction) {
        this.make = make;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    abstract public void drive(double speed);
    @Override
    public int compareTo(Vehicle o){
        if(getYearOfProduction()>o.getYearOfProduction()){
            return 1;
        }
        if(getYearOfProduction()<o.getYearOfProduction()){
            return 1;
        }
        else
            return 0;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
