package model;

public class DiagnosticoRetina {

	public EstadoRetina estadoRetina;

	public DiagnosticoRetina() {
		this.estadoRetina = EstadoRetina.NoDeterminado;
	}
	
	public EstadoRetina getEstadoRetina() {
		return estadoRetina;
	}

	public void setEstadoRetina(EstadoRetina estadoRetina) {
		this.estadoRetina = estadoRetina;
	}

	@Override
	public String toString() {
		return "DiagnosticoRetina [estadoRetina=" + estadoRetina + "]";
	}
	
}
