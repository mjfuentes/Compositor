package model;

public class TimedNote {
	@Override
	public String toString() {
		return (nota.toString()+duracion.toString());
	}
	Nota nota;
	Integer duracion;
	
	public TimedNote(Nota nota, Integer duracion) {
		this.nota = nota;
		this.duracion = duracion;
	}
	
	public Nota getNota() {
		return nota;
	}
	public Integer getDuracion() {
		return duracion;
	}
	
	
}
