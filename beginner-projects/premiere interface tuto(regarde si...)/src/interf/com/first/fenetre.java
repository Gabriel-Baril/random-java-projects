package interf.com.first;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fenetre extends JFrame{
	public fenetre(){
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    
	    JPanel pan = new JPanel();
	    pan.setBackground(Color.ORANGE);
	    
	    this.setContentPane(pan);
	    this.setVisible(true);
	    
	  }
	fenetre fen = new fenetre();
}
