package model;

public class Ojo {
	
	Cornea cornea;
	Cristalino cristalino;
	Esclerotica esclerotica;
	Iris iris;
	Pupila pupila;
	Retina retina;
	public Recomendacion recomendacion;
	
	
	public Ojo(Cornea cornea, Cristalino cristalino, Esclerotica esclerotica, Iris iris, Pupila pupila, Retina retina) {
		super();
		this.cornea = cornea;
		this.cristalino = cristalino;
		this.esclerotica = esclerotica;
		this.iris = iris;
		this.pupila = pupila;
		this.retina = retina;
		this.recomendacion = new Recomendacion();
	}
	public Cornea getCornea() {
		return cornea;
	}
	public void setCornea(Cornea cornea) {
		this.cornea = cornea;
	}
	public Cristalino getCristalino() {
		return cristalino;
	}
	public void setCristalino(Cristalino cristalino) {
		this.cristalino = cristalino;
	}
	public Esclerotica getEsclerotica() {
		return esclerotica;
	}
	public void setEsclerotica(Esclerotica esclerotica) {
		this.esclerotica = esclerotica;
	}
	public Iris getIris() {
		return iris;
	}
	public void setIris(Iris iris) {
		this.iris = iris;
	}
	public Pupila getPupila() {
		return pupila;
	}
	public void setPupila(Pupila pupila) {
		this.pupila = pupila;
	}
	public Retina getRetina() {
		return retina;
	}
	public void setRetina(Retina retina) {
		this.retina = retina;
	}
	public Recomendacion getRecomendacion() {
		return recomendacion;
	}
	public void setRecomendacion(Recomendacion recomendacion) {
		this.recomendacion = recomendacion;
	}

}
