package js9;

/*
 * Created Ahmad Zaki Alfaruq_21343079
 */

public class tugas_elevator {
    public static void main(String[] args) {
        latihan4 myElevator = new latihan4();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();
    }
}
