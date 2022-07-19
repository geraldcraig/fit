import stanford.karel.*;

public class SecondKarelProgram extends Karel {
	
	public void run() {
		checkBeepers();
		
	}
	
	private void checkBeepers() {
		if (noBeepersPresent() && frontIsClear()) {
			move();		
		} else if (frontIsBlocked()) {
			turnRight();
			move();
		}
	}

	private void turnRight() {
		for (int i = 0; i < 3; i++) {
			turnLeft();
		}
		
	}

}
