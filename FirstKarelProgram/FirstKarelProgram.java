/*
 * File: FirstKarelProgram.java 
 * ----------------------------
 * This program solves the problem of moving a beeper to a ledge.
 */

import stanford.karel.*;


public class FirstKarelProgram extends Karel {
	
	
	
	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		putBeeper();
		move();
	}
	
	private void turnRight() {
		for (int i = 0; i < 3; i++) {
			turnLeft();
		}
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	private void backup() {
		turnAround();
		move();
		turnAround();
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

		
}
