package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class ShotMovement {
	Timer movement;

	public ShotMovement() {}
		
	public void tick() {
		if (Var.shot == 1) {

			Var.shotX += Var.movespeed;
			

		}

	}
		
	

}
