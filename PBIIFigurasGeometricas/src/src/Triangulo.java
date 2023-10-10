package src;

public class Triangulo extends FiguraGeometrica implements Angulizable{

	protected Double base;
	protected Double altura;
	private Double lado1;
	private Double lado2;
	private Double lado3;

	public Triangulo(Double base, Double altura, Double lado1, Double lado2, Double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public Triangulo(Double base, Double altura, Double lado1, Double lado2) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}

	public Double getLado3() {
		return lado3;
	}

	public void setLado3(Double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public Double calcularArea() {
		if (pudoCalcular()) {
		return (base * altura) / 2;
		}
		return 0.0;
	}

	@Override
	public Double calcularPerimetro() {
		if (pudoCalcular()) {
		return lado1 + lado2 + lado3;
		}
		return 0.0;
	}
	
	public Boolean pudoCalcular() {
		Boolean sePudo = false;
		if (base>0 && altura>0 && lado1>0 && lado2>0 && lado3>0) {
			sePudo=true;
		} 
		return sePudo;
	}

	@Override
	public int obtenerCantidadDeLados() {
		return 3;
	}

	@Override
	public double obtenerMedidaDeAngulos() {
		return 0;
	}

}
