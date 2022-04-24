package model;

public class DiagnosticoCornea {
	public ResultadoDiagnosticoCornea resultadoFinal;
	
	public DiagnosticoCornea() {
		resultadoFinal = ResultadoDiagnosticoCornea.NoDeterminado; 
	}

	public ResultadoDiagnosticoCornea getResultadoFinal() {
		return resultadoFinal;
	}

	public void setResultadoFinal(ResultadoDiagnosticoCornea resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}
}
