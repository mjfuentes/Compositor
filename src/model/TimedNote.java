package model;

public class TimedNote {
	@Override
	public String toString() {
		return (nota.toString()+duracion.toString());
	}
	Nota nota;
	Duracion duracion;
	
	public TimedNote(Nota nota, Duracion duracion) {
		this.nota = nota;
		this.duracion = duracion;
	}
	
}
