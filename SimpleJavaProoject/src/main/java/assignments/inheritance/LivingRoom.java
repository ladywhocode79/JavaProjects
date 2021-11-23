package assignments.inheritance;

//subclass of parent class Home
public class LivingRoom extends Room {

    //parametrized constructor to set number of lights in a room
    LivingRoom(int noOfLightsInARoom){
        super("living room",noOfLightsInARoom);
    }

    //to give number of lights
    public void getNumberOfLights() {
        System.out.println("Number of lights in "+roomName+" is "+numberOfLights);
    }

}
