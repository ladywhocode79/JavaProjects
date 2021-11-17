package assignments.inheritance;
/*Inheritance: - Design number of lights in a house - Use a base class as home which has a method noOfLights .
Subclasses should have the rooms and the method should print the number of lights in the room*/


public class MyHouse {
    public static void main(String[] args) {

        //Set Room  lights
        Home drawingRoom = new DrawingRoom(4);
        Home livingRoom = new LivingRoom(3);
        Home masterBedRoom = new MasterBedRoom(3);
        Home kidsBedRoom = new KidsBedRoom(2);

        //get room  lights
        System.out.println(drawingRoom.roomName+" has "+ drawingRoom.getNumberOfLights() + " lights");
        System.out.println(livingRoom.roomName+" has "+ livingRoom.getNumberOfLights() + " lights");
        System.out.println(masterBedRoom.roomName+" has "+ masterBedRoom.getNumberOfLights() + " lights");
        System.out.println(kidsBedRoom.roomName+" has "+ kidsBedRoom.getNumberOfLights() + " lights");



    }
}
