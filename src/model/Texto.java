package model;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

public class Texto extends JTextField implements Observer{

	public Texto(String string, int i) {
		super(string,i);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setText(((Melodia) o).getString());
	}

}
