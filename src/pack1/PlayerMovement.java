package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	Timer movement;
	
	public int getX() {
		return Var.x;
	}
	public int getY() {
		return Var.y;
	}
	

	
	


	public PlayerMovement() {
		ShotMovement shot = new ShotMovement();
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.moveup == true) {
					if (Var.y > 0) {
						Var.y -= Var.movespeed;
						Var.movementdetected = 1;
						
						
					}

				} else if (Var.movedown == true) {
					if (Var.y < 1000) {
						Var.y += Var.movespeed;
						Var.movementdetected = 1;
					}
				}
				if (Var.moveleft == true) {
					if (Var.x > 0) {
						Var.x -= Var.movespeed;
						Var.movementdetected = 1;
					
					}

				} else if (Var.moveright == true) {
					if (Var.x < 1900) {
						Var.x += Var.movespeed;
						Var.movementdetected = 1;
					}
				}else{Var.movementdetected = 0;}
				shot.tick();
			}

		}, 0, 10);
	}

}
