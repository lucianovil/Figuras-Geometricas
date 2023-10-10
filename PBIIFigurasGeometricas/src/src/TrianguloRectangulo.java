package src;

public class TrianguloRectangulo extends Triangulo {
	
	public TrianguloRectangulo(Double base, Double altura, Double catetoOpuesto, Double catetoAdyacente, Double hipotenusa) {
		super(base, altura, catetoOpuesto, catetoAdyacente, hipotenusa);
	}
	
	public double calcularAngulo(double lado1, double lado2) {
        double anguloEnRadianes = Math.atan2(lado1, lado2);
        return Math.toDegrees(anguloEnRadianes);
    }


}
