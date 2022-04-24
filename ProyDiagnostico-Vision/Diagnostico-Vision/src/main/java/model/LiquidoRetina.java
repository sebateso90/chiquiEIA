package model;

public enum LiquidoRetina {
	///Liquido detras del tejido
	NoDeterminado,
	Si,
	No;
	
	public  Boolean isa(LiquidoRetina liquido) {
		return this.toString() == liquido.toString();
	}
}
