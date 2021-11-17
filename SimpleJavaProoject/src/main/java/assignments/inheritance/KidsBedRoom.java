package assignments.inheritance;

//subclass of parent class Home
public class KidsBedRoom extends Home{

    //parametrized constructor to set number of lights in a room and name
    KidsBedRoom(int noOfLightsInARoom){
        this.numberOfLights = noOfLightsInARoom;
        this.roomName ="Kids Bed room";
    }

}
