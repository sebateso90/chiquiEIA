package model;

public enum AccionRecomendada {
	NoEncontrada,
	OperacionConLaser,
	IntervencionQuirurgica,
	UsarGotaParaLosOjos,
	UsarLentes,
	UsoDeFarmacos;
	
	public Boolean isa(AccionRecomendada recomendacion) {
		return this.toString() == recomendacion.toString();
	}
}
