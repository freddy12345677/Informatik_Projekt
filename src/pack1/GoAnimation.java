package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GoAnimation {
	Timer t;
	private double temp = 0;

	public GoAnimation() {
		t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			@Override
			
			public void run() {
				
					if (temp == 0) {
						Var.shot = 0;
						System.out.println("awiduhapusd");
						temp++;
					} else if (temp == 1) {
						Var.shot = 1;
						temp--; 
						System.out.println("awiduhapusd");

					}
				
			}
			

		}, 0, 2);
	}

}
