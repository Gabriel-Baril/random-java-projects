import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		
		String chaine = JOptionPane.showInputDialog("Etat de votre interrupteur(off ou on) : ");
		
		if(chaine.equals("on")){
			JOptionPane.showMessageDialog(null, "Votre lampe est allumer");
		} else if(chaine.equals("off")){
			JOptionPane.showMessageDialog(null, "Votre lampe est fermer");
		} else {
			JOptionPane.showMessageDialog(null, "Votre lampe est bugger");
		}
		
	
	}

}
