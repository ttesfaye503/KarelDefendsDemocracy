package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			checkMiddleBeeper();
			checkBottomAndTopBeepers();
			move();
	}
}		
	private void checkMiddleBeeper() {
		if (beepersPresent()) {
			move();
			move();
			
		}
	}
	private void checkBottomAndTopBeepers() {
		if (noBeepersPresent()) {
			pickBeeperBottom();
			pickBeeperTop();
			
		}
	}
	
	private void pickBeeperBottom() {
		turnRight();
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
	
	private void pickBeeperTop() {
		move();
		if (frontIsClear()) {
			move();
	   }
		
	 while(beepersPresent())   {
		 pickBeeper();
	   }
	 turnAround();
	 move();
	 turnLeft();
	 
	}
	
}
	