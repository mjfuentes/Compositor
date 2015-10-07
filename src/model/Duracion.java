package model;

public enum Duracion {
	BLANCA("h","ui/blanca.png"), CORCHEA("i","ui/corchea.png"), FUSA("t","ui/fusa.png"), NEGRA("q","ui/negra.png"), REDONDA("w","ui/redonda.png"), SEMICORCHEA("s","ui/semicorchea.png"), SEMIFUSA("x","ui/semifusa.png");
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
