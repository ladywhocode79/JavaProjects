package assignments.inheritance;

//subclass of parent class Home
public class LivingRoom extends Home{

    //parametrized constructor to set number of lights in a room
    LivingRoom(int noOfLightsInARoom){
        this.numberOfLights = noOfLightsInARoom;
        this.roomName = "Living Room";
    }

    //to give number of lights
    public void getNumberOfLights() {
        System.out.println("Number of lights in "+roomName+" is "+numberOfLights);
    }

}
