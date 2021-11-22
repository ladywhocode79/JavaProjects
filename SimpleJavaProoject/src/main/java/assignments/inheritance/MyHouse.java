package assignments.inheritance;
/*Inheritance: - Design number of lights in a house - Use a base class as home which has a method noOfLights .
Subclasses should have the rooms and the method should print the number of lights in the room*/


import java.util.List;

public class MyHouse {
    public static void main(String[] args) {

        //Set Room  lights
        DrawingRoom drawingRoom = new DrawingRoom(4);
       LivingRoom livingRoom = new LivingRoom(3);
       MasterBedRoom masterBedRoom = new MasterBedRoom(3);
      KidsBedRoom kidsBedRoom = new KidsBedRoom(2);

        //get room  lights
        drawingRoom.getNumberOfLights();
        livingRoom.getNumberOfLights();
        masterBedRoom.getNumberOfLights();
        kidsBedRoom.getNumberOfLights();


    }
}
