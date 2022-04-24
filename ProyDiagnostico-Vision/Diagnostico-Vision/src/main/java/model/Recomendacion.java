package model;

public class Recomendacion {
	public DiagnosticoPreliminar diagnosticoPreliminar;
	public DiagnosticoCornea diagnosticoCornea;
	public DiagnosticoCristalino diagnosticoCristalino;
	public DiagnosticoRetina diagnosticoRetina;
	AccionRecomendada accion;
	
	public Recomendacion() {
		//Inicializamos los diagnosticos y la accion con el valor por default No Determinado.
		diagnosticoPreliminar = new DiagnosticoPreliminar();
		diagnosticoCornea = new DiagnosticoCornea();
		diagnosticoCristalino = new DiagnosticoCristalino();
		diagnosticoRetina = new DiagnosticoRetina();
		accion = AccionRecomendada.NoEncontrada;
		// En la etapa final del razonamiento se volcara la recomendacion final en accion.
	} 
	
	
	@Override
	public String toString() {
		return "Diagnosticos[diagnosticoPreliminar=" + diagnosticoPreliminar + ", diagnosticoCornea=" + diagnosticoCornea + ", diagnosticoCristalino=" + diagnosticoCristalino + ", diagnosticoRetina=" + diagnosticoRetina
				+ "]\n[Recomendacion final: " + accion + "]";
	}
	
	public AccionRecomendada getAccion() {
		return accion;
	}


	public void setAccion(AccionRecomendada accion) {
		this.accion = accion;
	}
}
