package assignments.inheritance;

//subclass of parent class Home
public class MasterBedRoom extends Room {

    //parametrized constructor to set number of lights in a room and name
    MasterBedRoom(int noOfLightsInARoom){
       super("Master Bedroom",noOfLightsInARoom);
    }
    //to give number of lights
    public void getNumberOfLights() {
        System.out.println("Number of lights in "+roomName+" is "+numberOfLights);
    }

}
