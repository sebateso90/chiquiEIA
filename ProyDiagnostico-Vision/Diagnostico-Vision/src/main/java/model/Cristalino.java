package model;

public class Cristalino {
	
	public ColorCristalino colorCristalino;
	
	public Cristalino() {
		this.colorCristalino = ColorCristalino.NoEspecificado;
	}

	public ColorCristalino getColorCristalino() {
		return colorCristalino;
	}

	public void setColorCristalino(ColorCristalino colorCristalino) {
		this.colorCristalino = colorCristalino;
	}

	@Override
	public String toString() {
		return "Cristalino [colorCristalino=" + colorCristalino + "]";
	}
	
}
