package assignments.inheritance;

//subclass of parent class Home
public class KidsBedRoom extends Home{

    //parametrized constructor to set number of lights in a room and name
    KidsBedRoom(int noOfLights){
        this.numberOfLights = noOfLights;
        this.roomName ="Kids Bed room";
    }
    //to give number of lights
    public void getNumberOfLights() {
        System.out.println("Number of lights in "+roomName+" is "+numberOfLights);
    }
}
