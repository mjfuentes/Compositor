package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Duracion;
import model.DuracionSeleccionada;
import model.Melodia;
import model.Nota;

public class NotaButtonClickedListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		if (DuracionSeleccionada.hayDuracionSeleccionada()){
			Duracion duracion = DuracionSeleccionada.getDuracionSeleccionada();
			String action = e.getActionCommand();
			switch (action){
				case "A":
					Melodia.getInstance().addNota(Nota.A,duracion);
					break;
				case "B":
					Melodia.getInstance().addNota(Nota.B,duracion);
					break;
				case "C":
					Melodia.getInstance().addNota(Nota.C,duracion);
					break;
				case "D":
					Melodia.getInstance().addNota(Nota.D,duracion);
					break;
				case "E":
					Melodia.getInstance().addNota(Nota.E,duracion);
					break;
				case "F":
					Melodia.getInstance().addNota(Nota.F,duracion);
					break;
				case "G":
					Melodia.getInstance().addNota(Nota.G,duracion);
					break;
			}	
			JOptionPane.showMessageDialog(null, "Nota agregada!");
			DuracionSeleccionada.quitarDuracionSeleccionada();
		}
	}
	

	
	
	
}
