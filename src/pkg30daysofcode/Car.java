/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30daysofcode;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lacy";

    double maxFuel = 17;
    double currentFuel = 8.5;
    double mpg = 28;

    int numberOfOccupants = 1;
    int maxNumberOfOccupants = 5;

    public Car () {}

    public Car(int custMaxSpeed, int custMinSpeed) {
        maxSpeed = custMaxSpeed;
        minSpeed = custMinSpeed;
    }

    /*
    Getters and Setters
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }
    public double getWeight() {
        return this.weight;
    }
    public boolean getIsTheCarOn() {
        return isTheCarOn;
    }



    public void printValues() {
        System.out.println("Max Speed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(maxFuel + " " + currentFuel + " " + mpg);
        System.out.println(numberOfOccupants);
    } 
    public void upgradeMaxSpeed(){
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void addPassenger() {
        if(numberOfOccupants < maxNumberOfOccupants) {
            numberOfOccupants++;
        }
    }

    public void dropOffPassenger() {
        if(numberOfOccupants > 0) {
            numberOfOccupants--;
        }
    }

    public double remainingFuelRange() {
        return mpg * currentFuel;
    }

    public double maxFuelRange () {
        return maxFuel * mpg;
    }

    public void startCar() {
        isTheCarOn = !isTheCarOn;
//        if(isTheCarOn == false) {
//            isTheCarOn = true;
//        } else {
//            isTheCarOn = false;
//        }
    }

    public static void main(String[] args) {
        Car familyCar = new Car(180, -1);
        System.out.println("Family Car");
        familyCar.printValues();
        familyCar.upgradeMaxSpeed();
        familyCar.printValues();
        familyCar.addPassenger();
        familyCar.dropOffPassenger();
    }
}