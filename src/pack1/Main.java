package pack1;

import java.awt.MouseInfo;

public class Main {

	public static void main(String[] args) {
		new Gui();
		new Var();
		new KeyHandler();
		new Label();
		new PlayerMovement();
		new GoAnimation();

		new MusicAndSounds();

		while (true) {
			double angle = Math.toRadians(-Math.toDegrees(Math.atan2((1090 - MouseInfo.getPointerInfo().getLocation().y) - (1090 - Var.y),MouseInfo.getPointerInfo().getLocation().x - Var.x)))- 44.9;
			
			double MoveShotX = Math.sin(angle);
	        double MoveShotY = Math.cos(angle);
			System.out.println(MoveShotX);
			System.out.println(MoveShotY);
			
		}

	}

}
