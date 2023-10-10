package src;

public class Circulo extends FiguraGeometrica {

	private Double radio;

	public Circulo(Double radio) {
		this.radio = radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	@Override
	public Double calcularArea() {
		if (pudoCalcular()) {
			return Math.PI * radio * radio;
		} else
			return 0.0;
	}

	@Override
	public Double calcularPerimetro() {
		if (pudoCalcular()) {
			return 2 * Math.PI * radio;
		} else
			return 0.0;
	}

	public Boolean pudoCalcular() {
		Boolean sePudo = false;
		if (radio > 0) {
			sePudo = true;
		}
		return sePudo;
	}

}
