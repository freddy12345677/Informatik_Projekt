package pack1;

import javax.swing.SwingUtilities;
import java.awt.event.MouseEvent;



public class MouseListener {
	MouseListener listener = new MouseListener() {
		public void mouseClicked(MouseEvent e) {
			System.out.println("click");
		}
    
		public void mousePressed(MouseEvent e) {
			if (SwingUtilities.isLeftMouseButton(e)) 
			{
				System.out.println("click");
			} 
			else if (SwingUtilities.isMiddleMouseButton(e)) 
			{
				System.out.println("click");
			}

		}

		public void mouseReleased(MouseEvent e) {
		}
	};
}
