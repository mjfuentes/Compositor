package model;

import java.util.Iterator;
import java.util.List;

public class Melodia {
	private static Melodia instancia;
	private List<Nota> notas;
	
	private Melodia(){
	}
	
	public Melodia getInstance(){
		if (instancia == null){
			instancia = new Melodia();
		}
		return instancia;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void addNota(Nota nota){
		notas.add(nota);
	}
	
	public void removeNota(Nota nota){
		notas.remove(nota);
	}
	
	public String getString(){
		StringBuilder builder = new StringBuilder();
		Iterator<Nota> iterator = notas.iterator();
		while(iterator.hasNext()){
			builder.append((iterator.next()).toString());
			builder.append(" ");
		}
		return builder.toString();
	}
	
}
