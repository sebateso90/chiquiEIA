package model;

public enum GrosorCornea {
	////Grosor
	NoEspecificado,
	Fino,
	Normal,
	Grueso;

	
	public  Boolean isa(GrosorCornea grosor) {
		return this.toString() == grosor.toString();
	}
}
