package assignments.inheritance;

//subclass of parent class Home
public class LivingRoom extends Home{

    //parametrized constructor to set number of lights in a room
    LivingRoom(int noOfLightsInARoom){
        this.numberOfLights = noOfLightsInARoom;
        this.roomName = "Living Room";
    }

}
