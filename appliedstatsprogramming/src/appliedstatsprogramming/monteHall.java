package appliedstatsprogramming;
import java.util.Random;

//https://stackoverflow.com/questions/26305386/monty-hall-game
public class monteHall {

		private static final String[] Doors = {"G", "D1", "D2"};
	    private final Random random = new Random();
	    private String correctDoor;

	    public void reset() {
	        correctDoor = Doors[random.nextInt(Doors.length)];
	    }

	    public boolean pickDoor(String door) {
	        return correctDoor.equals(door);
	    }

	    public String switchDoor(String firstDoor) {
	        for (String door : Doors) {
	            if (!door.equals(firstDoor) && !pickDoor(door)) {
	                return door;
	            }
	        }
	        return firstDoor;
	    

	}

}
