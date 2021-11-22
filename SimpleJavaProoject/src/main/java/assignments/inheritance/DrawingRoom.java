package assignments.inheritance;

//subclass of parent class Home
public class DrawingRoom extends Home{

    //parametrized constructor to set number of lights in a room and name
    DrawingRoom(int noOfLightsInARoom){
        this.numberOfLights = noOfLightsInARoom;
        this.roomName ="Drawing Room";
    }
    //to give number of lights
    public void getNumberOfLights() {
        System.out.println("Number of lights in "+roomName+" is "+numberOfLights);
    }
}
