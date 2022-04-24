package model;

public enum EstadoPupila {
	Contraida,
	Dilatada,
	Normal,
	NoEspecificado;
	
	public  Boolean isa(EstadoPupila estadoPupila) {
		return this.toString() == estadoPupila.toString();
	}
}
