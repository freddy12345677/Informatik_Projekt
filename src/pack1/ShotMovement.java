package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class ShotMovement {
	Timer t;
	private double temp = 0;

	public ShotMovement() {
		t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			@Override
			
			public void run() {
				
					Var.shotX = Var.shotX + Var.ShotVelX;
					Var.shotY = Var.shotY + Var.ShotVelX;
				
			}
			

		}, 0, 2);
	}
		
	

}
