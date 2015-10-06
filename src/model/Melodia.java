package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.jfugue.player.Player;

public class Melodia {
	private static Melodia instancia;
	private List<TimedNote> notas;
	private Player player;
	
	private Melodia(){
		notas = new ArrayList<TimedNote>();
		player = new Player();
		notas.add(new TimedNote(Nota.A, 5));
		notas.add(new TimedNote(Nota.C, 2));
	}
	
	public static Melodia getInstance(){
		if (instancia == null){
			instancia = new Melodia();
		}
		return instancia;
	}

	public void addNota(Nota nota, Integer duracion){
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
