package model;

public class DiagnosticoCristalino {

	public EstadoCristalino estadoCristalino;

	public DiagnosticoCristalino() {
		this.estadoCristalino = EstadoCristalino.NoEspecificado;
	}
	
	public EstadoCristalino getEstadoCristalino() {
		return estadoCristalino;
	}

	public void setEstadoCristalino(EstadoCristalino estadoCristalino) {
		this.estadoCristalino = estadoCristalino;
	}

	@Override
	public String toString() {
		return "DiagnosticoCristalino [estadoCristalino=" + estadoCristalino + "]";
	}
	
}
