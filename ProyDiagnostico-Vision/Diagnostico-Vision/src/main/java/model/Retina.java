package model;

public class Retina {

	public LiquidoRetina liquidoRetina;
	public RoturaRetina roturaRetina;
	
	public Retina() {
		this.liquidoRetina = LiquidoRetina.NoDeterminado;
		this.roturaRetina = RoturaRetina.NoDeterminado;
	}
	
	public LiquidoRetina getLiquidoRetina() {
		return liquidoRetina;
	}
	public void setLiquidoRetina(LiquidoRetina liquidoRetina) {
		this.liquidoRetina = liquidoRetina;
	}
	public RoturaRetina getRoturaRetina() {
		return roturaRetina;
	}
	public void setRoturaRetina(RoturaRetina roturaRetina) {
		this.roturaRetina = roturaRetina;
	}
	
	@Override
	public String toString() {
		return "Retina [liquidoRetina=" + liquidoRetina + ", roturaRetina=" + roturaRetina + "]";
	}
	
}
