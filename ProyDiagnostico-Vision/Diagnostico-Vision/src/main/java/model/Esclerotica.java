package model;

public class Esclerotica {

	public ColorEsclerotica colorEsclerotica;
	public ManchaEsclerotica manchaEsclerotica;
	
	public Esclerotica() {
		this.colorEsclerotica = ColorEsclerotica.NoEspecificado;
		this.manchaEsclerotica = ManchaEsclerotica.NoEspecificado;
	}

	public ColorEsclerotica getColorEsclerotica() {
		return colorEsclerotica;
	}

	public void setColorEsclerotica(ColorEsclerotica colorEsclerotica) {
		this.colorEsclerotica = colorEsclerotica;
	}

	public ManchaEsclerotica getManchaEsclerotica() {
		return manchaEsclerotica;
	}

	public void setManchaEsclerotica(ManchaEsclerotica manchaEsclerotica) {
		this.manchaEsclerotica = manchaEsclerotica;
	}

	@Override
	public String toString() {
		return "Esclerotica [colorEsclerotica=" + colorEsclerotica + ", manchaEsclerotica=" + manchaEsclerotica + "]";
	}

}
