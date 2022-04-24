package model;

public class DiagnosticoPreliminar {

	public ResultadoDiagnosticoPreliminar resultadoDiagnosticoPreliminar;
	public EstadoPupila estadoPupila;
	public EstadoIris estadoIris;
	public EstadoEsclerotica estadoEsclerotica;
	
	public DiagnosticoPreliminar() {
		this.resultadoDiagnosticoPreliminar = ResultadoDiagnosticoPreliminar.NoDeterminado;
		this.estadoPupila = EstadoPupila.NoEspecificado;
		this.estadoIris = EstadoIris.NoEspecificado;
		this.estadoEsclerotica = EstadoEsclerotica.NoEspecificado;
	}
	
	public ResultadoDiagnosticoPreliminar getResultadoDiagnosticoPreliminar() {
		return resultadoDiagnosticoPreliminar;
	}
	public void setResultadoDiagnosticoPreliminar(ResultadoDiagnosticoPreliminar resultadoDiagnosticoPreliminar) {
		this.resultadoDiagnosticoPreliminar = resultadoDiagnosticoPreliminar;
	}
	public EstadoPupila getEstadoPupila() {
		return estadoPupila;
	}
	public void setEstadoPupila(EstadoPupila estadoPupila) {
		this.estadoPupila = estadoPupila;
	}
	public EstadoIris getEstadoIris() {
		return estadoIris;
	}
	public void setEstadoIris(EstadoIris estadoIris) {
		this.estadoIris = estadoIris;
	}
	public EstadoEsclerotica getEstadoEsclerotica() {
		return estadoEsclerotica;
	}
	public void setEstadoEsclerotica(EstadoEsclerotica estadoEsclerotica) {
		this.estadoEsclerotica = estadoEsclerotica;
	}
	
	@Override
	public String toString() {
		return "DiagnosticoPreliminar [resultadoDiagnosticoPreliminar=" + resultadoDiagnosticoPreliminar
				+ ", estadoPupila=" + estadoPupila + ", estadoIris=" + estadoIris + ", estadoEsclerotica="
				+ estadoEsclerotica + "]";
	}
	
}
