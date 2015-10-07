package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Duracion;
import model.DuracionSeleccionada;
import model.Melodia;
import model.Nota;

public class NotaButtonClickedListener implements ActionListener{
	int baseDistance = 0;
	int tamNota = 10;
	JPanel pentagrama;
	public NotaButtonClickedListener() {
		// TODO Auto-generated constructor stub
	}
	public void actionPerformed(ActionEvent e) {
		if (DuracionSeleccionada.hayDuracionSeleccionada()){
			Duracion duracion = DuracionSeleccionada.getDuracionSeleccionada();
			ImageIcon icono = new ImageIcon(duracion.getLocation());
			JLabel label = new JLabel(icono, JLabel.CENTER);
			int y = getDistance(Melodia.getInstance().getCantNotas());
			String action = e.getActionCommand();
			switch (action){
				case "A":
					Melodia.getInstance().addNota(Nota.A,duracion);
					label.setLocation(60, y);
					break;
				case "B":
					Melodia.getInstance().addNota(Nota.B,duracion);
					label.setLocation(70, y);
					break;
				case "C":
					Melodia.getInstance().addNota(Nota.C,duracion);
					label.setLocation(10, y);
					break;
				case "D":
					Melodia.getInstance().addNota(Nota.D,duracion);
					label.setLocation(20, y);
					break;
				case "E":
					Melodia.getInstance().addNota(Nota.E,duracion);
					label.setLocation(30, y);
					break;
				case "F":
					Melodia.getInstance().addNota(Nota.F,duracion);
					label.setLocation(40, y);
					break;
				case "G":
					Melodia.getInstance().addNota(Nota.G,duracion);
					label.setLocation(50, y);
					break;
			}	
			JOptionPane.showMessageDialog(null, "Nota agregada!");
			DuracionSeleccionada.quitarDuracionSeleccionada();
			pentagrama.add(label);
		}
	}
	
	public int getDistance(int cantNotas){
		return baseDistance + (cantNotas * tamNota);
	}
	
	public void addPentagrama(JPanel pentagrama){
		this.pentagrama = pentagrama;
	}
	

	
	
	
}
