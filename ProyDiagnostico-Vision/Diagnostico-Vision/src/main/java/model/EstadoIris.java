package model;

public enum EstadoIris {
	Bueno,
	Regular,
	Iritis,
	NoEspecificado;
	
	public  Boolean isa(EstadoIris estadoIris) {
		return this.toString() == estadoIris.toString();
	}
	
}
