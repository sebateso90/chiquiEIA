package model;

public class Pupila {
	public Integer tamanioPupila ;

	public Pupila() {
		this.tamanioPupila = 0;
	}
	
	public Integer getTamanioPupila() {
		return tamanioPupila;
	}

	public void setTamanioPupila(Integer tamanioPupila) {
		this.tamanioPupila = tamanioPupila;
	}

	@Override
	public String toString() {
		return "Pupila [tamanioPupila=" + tamanioPupila + "]";
	}
}
