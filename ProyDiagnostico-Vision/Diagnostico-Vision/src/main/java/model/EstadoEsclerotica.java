package model;

public enum EstadoEsclerotica {
	Normal,
	Grave,
	Hemorragia,
	NoEspecificado;
	
	public  Boolean isa(EstadoEsclerotica estadoEsclerotica) {
		return this.toString() == estadoEsclerotica.toString();
	}
}
