import stanford.karel.*;

public class SecondKarelProgram2 extends Karel {
	
	public void run() {
		fullTree();
		
		
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
	
	private void makeBeeperSquare() {
		for (int i = 0; i < 4; i++) {
			putBeeper();
			move();
			turnLeft();
		}
	}
	
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}
	
	private void upAndRight() {
		turnLeft();
		move();
		turnRight();
		move();
	}
	
	private void downAndRight() {
		move();
		turnRight();
		move();
		turnLeft();
	}
	
	private void climbTree() {
		while (facingEast() && rightIsBlocked()) {
			if (frontIsClear() && rightIsBlocked()) {
				move();
			} else if (facingEast() && frontIsBlocked()) {
				turnLeft();
			}
			while (facingNorth() && rightIsBlocked()) {
				move();
			}
		}
	}
	
	private void topTree() {
		if (facingNorth()) {
			turnRight();
			makeBeeperSquare();
		}	
	}
	
	private void decendTree() {
		move();
		turnRight();
		move();
		turnLeft();
		
	}
	
	private void fullTree() {
		climbTree();
		topTree();
		decendTree();
		
	}

}
