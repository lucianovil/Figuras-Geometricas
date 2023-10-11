package src;

import java.awt.Color;

public class FiguraGeometrica {

	private Color colorContorno;
	private Color colorRelleno;

	public FiguraGeometrica() {
		this.colorContorno = Color.BLACK;
		this.colorRelleno = Color.WHITE;
	}
	
	public FiguraGeometrica(Color colorContorno, Color colorRelleno) {
		this.colorContorno = colorContorno;
		this.colorRelleno = colorRelleno;
	}

	public Color getColorContorno() {
		return colorContorno;
	}

	public void setColorContorno(Color colorContorno) {
		this.colorContorno = colorContorno;
	}

	public Color getColorRelleno() {
		return colorRelleno;
	}

	public void setColorRelleno(Color colorRelleno) {
		this.colorRelleno = colorRelleno;
	}

	public Double calcularArea() {
		return 0.0;
	}

	public Double calcularPerimetro() {
		return 0.0;
	}

}
