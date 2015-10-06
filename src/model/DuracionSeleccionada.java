package model;

public class DuracionSeleccionada {
	private static Duracion duracionSeleccionada;
	
	public static Duracion getDuracionSeleccionada() {
		return duracionSeleccionada;
	}

	public static void setDuracionSeleccionada(Duracion duracion) {
		duracionSeleccionada = duracion;
	}
	
	public static Boolean hayDuracionSeleccionada(){
		return (duracionSeleccionada != null);
	}
	
	public static void quitarDuracionSeleccionada(){
		duracionSeleccionada = null;
	}
}
