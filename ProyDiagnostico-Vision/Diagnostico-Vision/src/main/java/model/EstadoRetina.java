package model;

public enum EstadoRetina {
	NoDeterminado,
	Desprendida,
	Desgarrada;
	
	public  Boolean isa(EstadoRetina estadoRetina) {
		return this.toString() == estadoRetina.toString();
	}

}
