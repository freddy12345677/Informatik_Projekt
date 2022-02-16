package pack1;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.MouseInfo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Var {
	
	static JFrame jf1;
	static int screenWidth = 1920;
	static int screenHeight = 1080;
	static int backgroundY1 = 0;
	static int backgroundY2 = -1080;
	static int x = 700, y = 700;
	//eine weitere y koordinate um besser damit rechnen zu können, weil man den monitopr nicht als koordinatensystem sehen kann weil die y-Achse gespiegelt ist...
	static int ry = 1080 - y;
	
	static int movespeed = 3;
	static int dustanimation=1;
	static int weaponType = 0;  //welche Waffe er gerade besitzt
	static int shoot=0;
	static int shot;
	
	
	static double shotX = 1000;
	static double shotY = 500;
	public static double getAngle() {
		return Math.toRadians(-Math.toDegrees(Math.atan2((1090 - MouseInfo.getPointerInfo().getLocation().y) - (1090 - Var.y),MouseInfo.getPointerInfo().getLocation().x - Var.x)))- 44.9;
	}
	
	public static double getShotVelX() {
		return Math.sin(getAngle());
	}
    static double ShotVelX = getShotVelX();
	
	public static double getShotVelY() {
		return Math.cos(getAngle());
	}
	static double ShotVelY = getShotVelY();
    
	
	static int movementdetected=0;
	//verschiedene Waffen:
	Weapons ak = new Weapons("ak-47",35,10);
	Weapons m4a1 = new Weapons("M4A1",28,20);
	//
	
	//

	

	//KeyHandler
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	static Label lbl1;

	
	//Bilder
	static BufferedImage ib1, ib2;
	static BufferedImage iplayer;
	static BufferedImage idust1 ;
	static BufferedImage iglock18;
	static BufferedImage ishot;
	static BufferedImage ibullet;
	public Var() {
		try {
			ib1 = ImageIO.read(new File("b1.jpg"));
			ib2 = ImageIO.read(new File("b2.jpg"));
			iplayer = ImageIO.read(new File("player1.png"));
			idust1 = ImageIO.read(new File("dreck.png"));
			iglock18 = ImageIO.read(new File("glock18.png"));
			ibullet = ImageIO.read(new File("bullet.jpg"));
			
			
			
		

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");

		}//Audiodatei wird geladen
		MusicAndSounds.sounds("GrassStep.wav");
	}

}
