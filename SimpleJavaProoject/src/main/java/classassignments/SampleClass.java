package classassignments;

import classassignments.Car;

public class SampleClass {
    public static void main(String[] args) {

        Car familyCar = new Car();
        familyCar.color = "Blue";
        familyCar.fuelType ="Petrol";
        familyCar.numOfDoors = 4;
        familyCar.nameOfCar ="MyCar";
        familyCar.startTheCar(familyCar.nameOfCar);
        familyCar.setNumOfDoors();

        System.out.println("Number of doors in "+familyCar.nameOfCar+" is " +familyCar.numOfDoors);

    }
}
