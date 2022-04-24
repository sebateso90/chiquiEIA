package model;

public enum ColorEsclerotica {

	///Color
	Azulado,
	Blanco,
	OtroColor,
	NoEspecificado;
	
	public  Boolean isa(ColorEsclerotica color) {
		return this.toString() == color.toString();
	}
}
