package src;

public class Rectangulo extends FiguraGeometrica implements Angulizable {

	private Double ancho;
	private Double alto;

	public Rectangulo(Double ancho, Double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	@Override
	public Double calcularArea() {
		if (pudoCalcular()) {
			return ancho * alto;
		}
		return 0.0;
	}

	@Override
	public Double calcularPerimetro() {
		if (pudoCalcular()) {
			return 2 * (ancho + alto);
		}
		return 0.0;
	}

	public Boolean pudoCalcular() {
		Boolean sePudo = false;
		if (ancho > 0 && alto > 0) {
			sePudo = true;
		}
		return sePudo;
	}

	@Override
	public int obtenerCantidadDeLados() {
		return 4;
	}

	@Override
	public double obtenerMedidaDeAngulos() {
		return 90.0;
	}

}
