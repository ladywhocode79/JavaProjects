package assignments.inheritance;

//subclass of parent class Home
public class KidsBedRoom extends Room {

    //parametrized constructor to set number of lights in a room and name
    KidsBedRoom(int noOfLights){
        super("kids room",noOfLights);
    }
    //to give number of lights
    public void getNumberOfLights() {
        System.out.println("Number of lights in "+roomName+" is "+numberOfLights);
    }
}
