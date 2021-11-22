package assignments.inheritance;

//subclass of parent class Home
public class MasterBedRoom extends Home{

    //parametrized constructor to set number of lights in a room and name
    MasterBedRoom(int noOfLightsInARoom){
        this.numberOfLights = noOfLightsInARoom;
        this.roomName ="Master Bed room";
    }
    //to give number of lights
    public void getNumberOfLights() {
        System.out.println("Number of lights in "+roomName+" is "+numberOfLights);
    }

}
