package src;

public class TrianguloRectangulo extends Triangulo {

	public TrianguloRectangulo(Double base, Double altura) {
		super(base, altura, altura, base);
	}

	public double calcularAngulo(double base, double altura) {
		double anguloEnRadianes = Math.atan2(base, altura);
		return Math.toDegrees(anguloEnRadianes);
	}

	public double calcularHipotenusa() {
		this.setLado3(Math.sqrt(base * base + altura * altura));
		return this.getLado3();
	}

}
