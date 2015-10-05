package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class NotaButtonClickedListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		switch (action){
			case "A":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "B":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "C":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "D":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "F":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "G":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
		}	
	}
	

	
	
	
}
