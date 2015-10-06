package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Duracion;
import model.DuracionSeleccionada;
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
				DuracionSeleccionada.setDuracionSeleccionada(Duracion.BLANCA);
				break;
			case "negra":
				DuracionSeleccionada.setDuracionSeleccionada(Duracion.NEGRA);
				break;
			case "corchea":
				DuracionSeleccionada.setDuracionSeleccionada(Duracion.CORCHEA);
				break;
			case "fusa":
				DuracionSeleccionada.setDuracionSeleccionada(Duracion.FUSA);
				break;
			case "redonda":
				DuracionSeleccionada.setDuracionSeleccionada(Duracion.REDONDA);
				break;
			case "semiCorchea":
				DuracionSeleccionada.setDuracionSeleccionada(Duracion.SEMICORCHEA);
				break;
			case "semiFusa":
				DuracionSeleccionada.setDuracionSeleccionada(Duracion.SEMIFUSA);
				break;
			case "play":
				Melodia.getInstance().play();
				break;
		}	
	}
	}

