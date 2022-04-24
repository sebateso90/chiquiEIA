package model;

public enum ResultadoDiagnosticoPreliminar {
	NoDeterminado,
	EscleroticaAlterada,
	IrisInflamada,
	PupilaContraida,
	PupilaDilatada;
	
	public Boolean isa(ResultadoDiagnosticoPreliminar resultado) {
		return this.toString() == resultado.toString();
	}
}
