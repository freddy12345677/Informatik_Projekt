
package pack1;
import javax.swing.JFrame;

public class Gui {

	public Gui() {
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenWidth,Var.screenHeight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("Spiele Name");
		Var.jf1.setResizable(false);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.requestFocus();
		
		
		
		
		Var.lbl1 = new Label();
		
		Var.lbl1.setBounds(0,0,Var.screenWidth,Var.screenHeight);
		
		Var.jf1.add(Var.lbl1);
		Var.jf1.setVisible(true);
		Var.lbl1.setVisible(true);
	}

}
