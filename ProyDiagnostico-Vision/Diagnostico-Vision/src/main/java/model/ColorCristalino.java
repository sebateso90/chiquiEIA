package model;

public enum ColorCristalino {
	Transparente,
	Opaco,
	NoEspecificado;
	
	public  Boolean isa(ColorCristalino color) {
		return this.toString() == color.toString();
		}

}
