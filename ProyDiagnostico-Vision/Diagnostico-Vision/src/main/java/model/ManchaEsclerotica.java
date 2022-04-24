package model;

public enum ManchaEsclerotica {
	Roja,
	SinMancha,
	NoEspecificado;
	
	public  Boolean isa(ManchaEsclerotica mancha) {
		return this.toString() == mancha.toString();
	}
}
