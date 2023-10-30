package appliedstatsprogramming;

public class monteHallTester {

	public static void main(String[] args) {
		monteHall monteHall = new monteHall();
        int winsBeforeSwitch = 0;
        for (int i = 0; i < 10000; i++) {
            monteHall.reset();
            if (monteHall.pickDoor("G")) {
                winsBeforeSwitch++;
            }
        }
        System.out.println("% of wins before switching: " + winsBeforeSwitch / 100 + "%");

        int winsAfterSwitch = 0;
        for (int j = 0; j < 10000; j++) {
            monteHall.reset();
            String firstDoor = "G";
            String switchDoor = monteHall.switchDoor(firstDoor);
            if (monteHall.pickDoor(switchDoor)) {
                winsAfterSwitch++;
            }
        }
        System.out.println("% of wins after switching: " + winsAfterSwitch /100 + "%" );
    }

	}


