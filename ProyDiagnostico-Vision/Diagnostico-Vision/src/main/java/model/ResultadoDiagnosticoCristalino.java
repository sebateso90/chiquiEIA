package model;

public enum ResultadoDiagnosticoCristalino {
	Normal,
	Cataratas,
	NoDeterminado;
	
	public  Boolean isa(ResultadoDiagnosticoCristalino resultado) {
		return this.toString() == resultado.toString();
	}
}
