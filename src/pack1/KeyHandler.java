package pack1;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		 if(e.getKeyCode()==KeyEvent.VK_UP) {
			 Var.moveup = true;
			 Var.movementdetected = 1;
			 
			 System.out.println(Var.movementdetected);
             System.out.println(Var.dustanimation);
		 }
		 if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			 Var.moveright = true;
			 Var.movementdetected = 1;
			 
			 System.out.println(Var.movementdetected);
             System.out.println(Var.dustanimation);
		 }
		 if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			 Var.moveleft = true;
			 Var.movementdetected = 1;
			 
			 System.out.println(Var.movementdetected);
             System.out.println(Var.dustanimation);
		 }
		 if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			 Var.movedown = true;
			 Var.movementdetected = 1;
			 
			 System.out.println(Var.movementdetected);
             System.out.println(Var.dustanimation);
		 }
		
		
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			 Var.moveup = false;
			 Var.movementdetected = 0;
		 }
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			 Var.moveright = false;
			 Var.movementdetected = 0;
		 }
		 if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			 Var.moveleft = false;
			 Var.movementdetected = 0;
		 }
		 if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			 Var.movedown = false;
			 Var.movementdetected = 0;
		 }
		

	}

}
