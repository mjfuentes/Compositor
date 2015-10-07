package listener;

import java.awt.BorderLayout;
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
	int baseDistance = 53;
	int tamNota = 30;
	JPanel pentagrama;
	public NotaButtonClickedListener() {
		// TODO Auto-generated constructor stub
	}
	public void actionPerformed(ActionEvent e) {
		if (DuracionSeleccionada.hayDuracionSeleccionada()){
			Duracion duracion = DuracionSeleccionada.getDuracionSeleccionada();
			ImageIcon icono = new ImageIcon(duracion.getLocation());
			JLabel nota = new JLabel();
	        nota.setIcon(new ImageIcon(ClassLoader.getSystemResource(duracion.getLocation())));
			int x = getDistance(Melodia.getInstance().getCantNotas());
			String action = e.getActionCommand();
			switch (action){
				case "A":
					Melodia.getInstance().addNota(Nota.A,duracion);
					nota.setBounds(x, 13, 30, 30);
					break;
				case "B":
					Melodia.getInstance().addNota(Nota.B,duracion);
					nota.setBounds(x, 3, 30, 30);
					break;
				case "C":
					Melodia.getInstance().addNota(Nota.C,duracion);
					nota.setBounds(x, 63, 30, 30);
					break;
				case "D":
					Melodia.getInstance().addNota(Nota.D,duracion);
					nota.setBounds(x, 53, 30, 30);
					break;
				case "E":
					Melodia.getInstance().addNota(Nota.E,duracion);
					nota.setBounds(x, 43, 30, 30);
					break;
				case "F":
					Melodia.getInstance().addNota(Nota.F,duracion);
					nota.setBounds(x, 33, 30, 30);
					break;
				case "G":
					Melodia.getInstance().addNota(Nota.G,duracion);
					nota.setBounds(x, 23, 30, 30);
					break;
			}	
			JOptionPane.showMessageDialog(null, "Nota agregada!");
			DuracionSeleccionada.quitarDuracionSeleccionada();
			this.pentagrama.add(nota,3);
			this.pentagrama.revalidate();
			this.pentagrama.repaint();
		}
	}
	
	public int getDistance(int cantNotas){
		return baseDistance + (cantNotas * tamNota);
	}
	
	public void addPentagrama(JPanel pentagrama){
		this.pentagrama = pentagrama;
	}
	

	
	
	
}
