package listener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import model.Duracion;
import model.DuracionSeleccionada;
import model.Melodia;
import model.Nota;

public class PentagramaClickedListener implements MouseListener{
	int baseDistance = 53;
	int tamNota = 30;
	JPanel pentagrama;
	
	@Override	
	public void mouseClicked(MouseEvent e) {
		if (DuracionSeleccionada.hayDuracionSeleccionada() && (e.getX() > 60) && (e.getX() < 600)){
			Duracion duracion = DuracionSeleccionada.getDuracionSeleccionada();
			JLabel nota = new JLabel();
	        nota.setIcon(new ImageIcon(ClassLoader.getSystemResource(duracion.getLocation())));
			int x = getDistance(Melodia.getInstance().getCantNotas());
			if ((e.getY() < 89) && (e.getY() >= 47)){
				if ((e.getY() > 83) && (e.getY() <= 89)){	
						Melodia.getInstance().addNota(Nota.C,duracion);
						nota.setBounds(x, 58, 30, 30);
				}
				if ((e.getY() > 77) && (e.getY() <= 83)){	
						Melodia.getInstance().addNota(Nota.D,duracion);
						nota.setBounds(x, 52, 30, 30);
				}
				if ((e.getY() > 71) && (e.getY() <= 77)){	
						Melodia.getInstance().addNota(Nota.E,duracion);
						nota.setBounds(x, 46, 30, 30);
				}
				if ((e.getY() > 65) && (e.getY() <= 71)){	
						Melodia.getInstance().addNota(Nota.F,duracion);
						nota.setBounds(x, 40, 30, 30);
				}
				if ((e.getY() > 59) && (e.getY() <= 65)){	
						Melodia.getInstance().addNota(Nota.G,duracion);
						nota.setBounds(x, 34, 30, 30);
				}	
				if ( (e.getY() > 53) && (e.getY() <= 59)){	
					Melodia.getInstance().addNota(Nota.A,duracion);
					nota.setBounds(x, 28, 30, 30);
				}
				if ((e.getY() > 47) && (e.getY() <= 53)){	
					Melodia.getInstance().addNota(Nota.B,duracion);
					nota.setBounds(x, 22, 30, 30);
				}
				DuracionSeleccionada.quitarDuracionSeleccionada();
				this.pentagrama.add(nota,Melodia.getInstance().getCantNotas(),0);
				this.pentagrama.revalidate();
				this.pentagrama.repaint();
			}
		}
	}

	
	public int getDistance(int cantNotas){
		return baseDistance + (cantNotas * tamNota);
	}
	
	public void addPentagrama(JPanel pentagrama){
		this.pentagrama = pentagrama;
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
