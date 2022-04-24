package model;

public enum FormaCornea {
	
	////Forma
	NoEspecificado,
	Circular,
	Conica;
		
	public  Boolean isa(FormaCornea forma) {
		return this.toString() == forma.toString();
	}
}
