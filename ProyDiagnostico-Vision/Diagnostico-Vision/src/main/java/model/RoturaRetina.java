package model;

public enum RoturaRetina {
	Si,
	No,
	NoDeterminado;
	
	public  Boolean isa(RoturaRetina rotura) {
		return this.toString() == rotura.toString();
	}
}
