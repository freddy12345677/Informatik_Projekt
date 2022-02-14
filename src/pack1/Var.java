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
	
	
	static int shotX;
	static int shotY;
	
	static int movementdetected=0;
	//verschiedene Waffen:
	Weapons ak = new Weapons("ak-47",35,10);
	Weapons m4a1 = new Weapons("M4A1",28,20);
	//
	public double map(MouseInfo.getPointerInfo().getLocation().x, double in_min, double in_max, double out_min, double out_max)
	{
	  return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
	}
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
	public Var() {
		try {
			ib1 = ImageIO.read(new File("b1.jpg"));
			ib2 = ImageIO.read(new File("b2.jpg"));
			iplayer = ImageIO.read(new File("player1.png"));
			idust1 = ImageIO.read(new File("dreck.png"));
			iglock18 = ImageIO.read(new File("glock18.png"));
			
			
			
		

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");

		}//Audiodatei wird geladen
		MusicAndSounds.sounds("GrassStep.wav");
	}

}
