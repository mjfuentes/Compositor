package model;

public enum Nota {
	A("LA"),B("SI"),C("DO"),D("RE"),E("MI"),F("FA"),G("SOL");
	
	String traduccion;
	
	Nota(String traduccion){
		this.traduccion = traduccion;
	}
}
