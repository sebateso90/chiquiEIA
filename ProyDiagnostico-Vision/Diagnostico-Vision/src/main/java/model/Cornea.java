package model;

public class Cornea {
	
	FormaCornea formaCornea;
	GrosorCornea grosorCornea;
	
	public Cornea() {
		formaCornea = FormaCornea.NoEspecificado;
		grosorCornea = GrosorCornea.NoEspecificado;
	}
	
	public FormaCornea getFormaCornea() {
		return formaCornea;
	}
	public void setFormaCornea(FormaCornea formaCornea) {
		this.formaCornea = formaCornea;
	}
	public GrosorCornea getGrosorCornea() {
		return grosorCornea;
	}
	public void setGrosorCornea(GrosorCornea grosorCornea) {
		this.grosorCornea = grosorCornea;
	}
	
	@Override
	public String toString() {
		return "Cornea [forma=" + formaCornea + ", grosor=" + grosorCornea + "]";
	}
}
