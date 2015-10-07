package model;

public enum Duracion {
	BLANCA("h","images/blanca.png"), CORCHEA("i","images/corchea.png"), FUSA("t","images/fusa.png"), NEGRA("q","images/negra.png"), REDONDA("w","images/redonda.png"), SEMICORCHEA("s","images/semicorchea.png"), SEMIFUSA("x","images/semifusa.png");
	@Override
	public String toString() {
		return this.duration;
	}
	String location;
	String duration;
	Duracion(String duration, String location){
		this.duration = duration;
		this.location = location;
	}
	
	public String getLocation(){
		return this.location;
	}
}
