package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GoAnimation {
	Timer t;
	private double temp = 1;
	
	public  GoAnimation() {
		t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (temp ==0) {
			Var.dustanimation=0;
			temp++;}
		else if(temp==1) {
			Var.dustanimation=1;
			temp--;
			
		}
		
			}
			
		},0,200);
	}

}
