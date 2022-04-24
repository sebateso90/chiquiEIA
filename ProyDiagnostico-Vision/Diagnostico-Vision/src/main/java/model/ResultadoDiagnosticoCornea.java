package model;

public enum ResultadoDiagnosticoCornea {
	NoDeterminado,
	Normal,
	Regular,
	Queratocono;
	
	public  Boolean isa(ResultadoDiagnosticoCornea resultado) {
		return this.toString() == resultado.toString();
	}
}
