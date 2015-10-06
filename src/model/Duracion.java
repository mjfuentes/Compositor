package model;

public enum Duracion {
	BLANCA("h"), CORCHEA("i"), FUSA("t"), NEGRA("q"), REDONDA("w"), SEMICORCHEA("s"), SEMIFUSA("x");
	@Override
	public String toString() {
		return this.duration;
	}
	String duration;
	Duracion(String duration){
		this.duration = duration;
	}
}
