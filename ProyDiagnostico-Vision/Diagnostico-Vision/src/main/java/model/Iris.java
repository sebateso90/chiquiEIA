package model;

public class Iris {

	public Integer inflamacion;

	public Iris() {
		this.inflamacion = 0;
	}
	
	public Integer getInflamacion() {
		return inflamacion;
	}

	public void setInflamacion(Integer inflamacion) {
		this.inflamacion = inflamacion;
	}

	@Override
	public String toString() {
		return "Iris [inflamacion=" + inflamacion + "]";
	}
	
}
