package assignments.inheritance;

//subclass of parent class Home
public class DrawingRoom extends Home{

    //parametrized constructor to set number of lights in a room and name
    DrawingRoom(int noOfLightsInARoom){
        this.numberOfLights = noOfLightsInARoom;
        this.roomName ="Drawing Room";
    }

}
