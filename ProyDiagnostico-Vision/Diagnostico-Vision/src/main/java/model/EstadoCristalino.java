package model;

public enum EstadoCristalino {
	Normal,
	Cataratas,
	NoEspecificado;
	
	public  Boolean isa(EstadoCristalino estadoCristalino) {
		return this.toString() == estadoCristalino.toString();
	}

}
