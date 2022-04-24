package model;

public enum ResultadoDiagnosticoRetina {
	NoDeterminado,
	Normal,
	Desprendida,
	Desgarrada;
	
	public  Boolean isa(ResultadoDiagnosticoRetina resultado) {
		return this.toString() == resultado.toString();
	}
}
