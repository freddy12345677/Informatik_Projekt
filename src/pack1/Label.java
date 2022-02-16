package pack1;

import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.geom.AffineTransform;
import java.util.Timer;
import java.util.TimerTask;

public class Label extends JLabel {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		AffineTransform at = AffineTransform.getTranslateInstance(Var.x, Var.y);
		AffineTransform at2 = AffineTransform.getTranslateInstance(Var.shotX, Var.shotY);
		

		at.rotate(Math.toRadians(-Math.toDegrees(Math.atan2((1090 - MouseInfo.getPointerInfo().getLocation().y) - (1090 - Var.y),MouseInfo.getPointerInfo().getLocation().x - Var.x)))- 44.9);
		at2.rotate(Math.toRadians(Var.getAngle()));
		
	    
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(Var.ib1, 0, Var.backgroundY1, 1920, 1080, null);
		g.drawImage(Var.ib2, 0, Var.backgroundY2, 1920, 1080, null);

		g2d.drawImage(Var.iglock18, at, null);
		g2d.drawImage(Var.iplayer, at, null);
		if(Var.shoot ==1) {
		g2d.drawImage(Var.ibullet, at2, null);
		
		}
		
		
		
		

		

		repaint();

	}

}
