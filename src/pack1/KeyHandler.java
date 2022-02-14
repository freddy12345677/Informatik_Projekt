package pack1;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		 if(e.getKeyCode()==KeyEvent.VK_W) {
			 Var.moveup = true;
			 Var.movementdetected = 1;
			 
			 
		 }
		 if(e.getKeyCode()==KeyEvent.VK_D) {
			 Var.moveright = true;
			 Var.movementdetected = 1;
			 
			
		 }
		 if(e.getKeyCode()==KeyEvent.VK_A) {
			 Var.moveleft = true;
			 Var.movementdetected = 1;
			 
		
		 }
		 if(e.getKeyCode()==KeyEvent.VK_S) {
			 Var.movedown = true;
			 Var.movementdetected = 1;
			 
			
		 }
		 if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			Var.shoot=1;
			System.out.println("space");
		 }
		
		
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			Var.shoot = 0;
		 }
		if(e.getKeyCode()==KeyEvent.VK_W) {
			 Var.moveup = false;
			 Var.movementdetected = 0;
		 }
		if(e.getKeyCode()==KeyEvent.VK_D) {
			 Var.moveright = false;
			 Var.movementdetected = 0;
		 }
		 if(e.getKeyCode()==KeyEvent.VK_A) {
			 Var.moveleft = false;
			 Var.movementdetected = 0;
		 }
		 if(e.getKeyCode()==KeyEvent.VK_S) {
			 Var.movedown = false;
			 Var.movementdetected = 0;
		 }
		

	}

}
