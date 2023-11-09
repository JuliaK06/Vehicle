package com.company;

public class Car extends Vehicle{
    private int hp;

    public Car(String make, String model, int yearOfProduction, int hp) {
        super(make, model, yearOfProduction);
        this.hp = hp;
    }
    @Override
    public void drive(double speed){
        System.out.println("Driving at"+ speed);
    }

    @Override
    public String toString(){
        return "Car"+
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
