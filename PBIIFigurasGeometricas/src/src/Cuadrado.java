package src;

public class Cuadrado extends Rectangulo {

	private Double lado;

	public Cuadrado(Double lado) {
		super(lado, lado);
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

}
