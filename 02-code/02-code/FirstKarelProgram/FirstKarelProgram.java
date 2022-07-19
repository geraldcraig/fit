/*
 * File: FirstKarelProgram.java 
 * ----------------------------
 * This program solves the problem of moving a beeper to a ledge.
 */

import stanford.karel.*;


public class FirstKarelProgram extends Karel {
	
	
	public void run() {
		moveForward();
		
		
		
		
	}

	private void putBeeperLine() {
		while (frontIsClear()) {
			putBeeper();
			move();
			putBeeper();
		}	
	}
	
	private void turnRight() {
		for (int i = 0; i < 3; i++) {
			turnLeft();
		}
	}
	
	private void moveForward() {
		while ((facingEast()) && (rightIsBlocked())) {
			move();
			
			if ((frontIsBlocked()) && rightIsBlocked()) {
				turnLeft();
				move();
			}
			
		}
	}

		
}
