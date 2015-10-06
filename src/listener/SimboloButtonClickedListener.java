package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Melodia;

public class SimboloButtonClickedListener implements ActionListener {
	
	int corrimiento;
	
	public void setCorrimiento(int c){
		corrimiento= c;
	}
	public int getCorrimiento(){
		return corrimiento;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		switch (action){
			case "blanca":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "negra":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "corchea":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "fusa":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "redonda":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "semiCorchea":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "semiFusa":
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				break;
			case "play":
				Melodia.getInstance().play();
				break;
		}	
	}
	}

