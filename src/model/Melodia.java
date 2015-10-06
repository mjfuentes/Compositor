package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.jfugue.player.Player;

public class Melodia extends Observable {
	
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	private static Melodia instancia;
	private List<TimedNote> notas;
	private Player player;
	
	private Melodia(){
		notas = new ArrayList<TimedNote>();
		player = new Player();
		notas.add(new TimedNote(Nota.A, Duracion.FUSA));
		notas.add(new TimedNote(Nota.C, Duracion.REDONDA));
	}
	
	public static Melodia getInstance(){
		if (instancia == null){
			instancia = new Melodia();
		}
		return instancia;
	}

	public void addNota(Nota nota, Duracion duracion){
		notas.add(new TimedNote(nota, duracion));
	}
	
	public void removeNota(Nota nota){
		notas.remove(nota);
	}
	
	public String getString(){
		StringBuilder builder = new StringBuilder();
		Iterator<TimedNote> iterator = notas.iterator();
		while(iterator.hasNext()){
			builder.append((iterator.next()).toString());
			builder.append(" ");
		}
		return builder.toString();
	}
	
	public void play(){
		player.play(this.getString());
	}
	
}
