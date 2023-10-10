package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Circulo;
import src.Cuadrado;
import src.FiguraGeometrica;
import src.Rectangulo;
import src.Triangulo;
import src.TrianguloEquilatero;
import src.TrianguloEscaleno;
import src.TrianguloIsosceles;
import src.TrianguloRectangulo;

public class FigurasGeometricasTest {

	@Test
	public void queSePuedaCrearUnaFiguraGeometrica() {
		FiguraGeometrica nueva = new FiguraGeometrica();
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnCirculo() {
		Double radio = 3.0;
		Circulo nueva = new Circulo(radio);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnTriangulo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado1 = 3.0;
		Double lado2 = 3.0;
		Double lado3 = 3.0;
		Triangulo nueva = new Triangulo(base, altura, lado1, lado2, lado3);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnTrianguloEquilatero() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado = 3.0;
		TrianguloEquilatero nueva = new TrianguloEquilatero(base, altura, lado);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnTrianguloIsosceles() {
		Double base = 10.0;
		Double altura = 20.0;
		Double ladoRepetido = 3.0;
		Double ladoDesigual = 8.0;
		TrianguloIsosceles nueva = new TrianguloIsosceles(base, altura, ladoRepetido, ladoDesigual);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnTrianguloEscaleno() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado1 = 3.0;
		Double lado2 = 8.0;
		Double lado3 = 20.0;
		TrianguloEscaleno nueva = new TrianguloEscaleno(base, altura, lado1, lado2, lado3);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnTrianguloRectangulo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double catetoOpuesto = 3.0;
		Double catetoAdyacente = 8.0;
		Double hipotenusa = 9.0;
		TrianguloRectangulo nueva = new TrianguloRectangulo(base, altura, catetoOpuesto, catetoAdyacente, hipotenusa);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnRectangulo() {
		Double ancho = 3.0;
		Double alto = 3.0;
		Rectangulo nueva = new Rectangulo(ancho, alto);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCrearUnCuadrado() {
		Double lado = 3.0;
		Cuadrado nueva = new Cuadrado(lado);
		assertNotNull(nueva);
	}

	@Test
	public void queSePuedaCalcularElAreaDelCirculo() {
		Double radio = 3.0;
		Circulo nueva = new Circulo(radio);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 28.27;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElAreaDelCirculoSiElRadioEsNegativo() {
		Double radio = -3.0;
		Circulo nueva = new Circulo(radio);
		nueva.calcularArea();
		assertFalse(nueva.pudoCalcular());

	}

	@Test
	public void queSePuedaCalcularElPerimetroDelCirculo() {
		Double radio = 3.0;
		Circulo nueva = new Circulo(radio);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 18.85;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElPerimetroDelCirculoSiElRadioEsNegativo() {
		Double radio = -3.0;
		Circulo nueva = new Circulo(radio);
		nueva.calcularPerimetro();
		assertFalse(nueva.pudoCalcular());

	}

	@Test
	public void queSePuedaCalcularElAreaDelTriangulo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado1 = 10.0;
		Double lado2 = 20.0;
		Double lado3 = 3.0;
		Triangulo nueva = new Triangulo(base, altura, lado1, lado2, lado3);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 100.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElAreaDelTrianguloSiLaBaseEsNegativa() {
		Double base = -10.0;
		Double altura = 20.0;
		Double lado1 = 10.0;
		Double lado2 = 20.0;
		Double lado3 = 3.0;
		Triangulo nueva = new Triangulo(base, altura, lado1, lado2, lado3);
		nueva.calcularArea();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElPerimetroDelTriangulo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado1 = 10.0;
		Double lado2 = 20.0;
		Double lado3 = 3.0;
		Triangulo nueva = new Triangulo(base, altura, lado1, lado2, lado3);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 33.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElPerimetroDelTrianguloSiAlgunLadoEsNegativo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado1 = 10.0;
		Double lado2 = -20.0;
		Double lado3 = 3.0;
		Triangulo nueva = new Triangulo(base, altura, lado1, lado2, lado3);
		nueva.calcularPerimetro();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElAreaDelTrianguloEquilatero() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado = 10.0;
		TrianguloEquilatero nueva = new TrianguloEquilatero(base, altura, lado);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 100.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElAreaDelTrianguloEquilateroSiLaBaseEsNegativa() {
		Double base = -10.0;
		Double altura = 20.0;
		Double lado = 10.0;
		TrianguloEquilatero nueva = new TrianguloEquilatero(base, altura, lado);
		nueva.calcularPerimetro();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElPerimetroDelTrianguloEquilatero() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado = 15.0;
		TrianguloEquilatero nueva = new TrianguloEquilatero(base, altura, lado);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 45.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElPerimetroDelTrianguloEquilateroSiElLadoEsNegativo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado = -10.0;
		TrianguloEquilatero nueva = new TrianguloEquilatero(base, altura, lado);
		nueva.calcularPerimetro();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElAreaDelTrianguloIsosceles() {
		Double base = 10.0;
		Double altura = 20.0;
		Double ladoRepetido = 3.0;
		Double ladoDesigual = 8.0;
		TrianguloIsosceles nueva = new TrianguloIsosceles(base, altura, ladoRepetido, ladoDesigual);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 100.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queSePuedaCalcularElPerimetroDelTrianguloIsosceles() {
		Double base = 10.0;
		Double altura = 20.0;
		Double ladoRepetido = 3.0;
		Double ladoDesigual = 8.0;
		TrianguloIsosceles nueva = new TrianguloIsosceles(base, altura, ladoRepetido, ladoDesigual);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 14.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queSePuedaCalcularElAreaDelTrianguloEscaleno() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado1 = 3.0;
		Double lado2 = 8.0;
		Double lado3 = 20.0;
		TrianguloEscaleno nueva = new TrianguloEscaleno(base, altura, lado1, lado2, lado3);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 100.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queSePuedaCalcularElPerimetroDelTrianguloEscaleno() {
		Double base = 10.0;
		Double altura = 20.0;
		Double lado1 = 3.0;
		Double lado2 = 8.0;
		Double lado3 = 20.0;
		TrianguloEscaleno nueva = new TrianguloEscaleno(base, altura, lado1, lado2, lado3);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 31.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queSePuedaCalcularElAreaDelTrianguloRectangulo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double catetoOpuesto = 3.0;
		Double catetoAdyacente = 8.0;
		Double hipotenusa = 9.0;
		TrianguloRectangulo nueva = new TrianguloRectangulo(base, altura, catetoOpuesto, catetoAdyacente, hipotenusa);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 100.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElAreaDelTrianguloRectanguloSiLaAlturaEsNegativa() {
		Double base = 10.0;
		Double altura = -20.0;
		Double catetoOpuesto = 3.0;
		Double catetoAdyacente = 8.0;
		Double hipotenusa = 9.0;
		TrianguloRectangulo nueva = new TrianguloRectangulo(base, altura, catetoOpuesto, catetoAdyacente, hipotenusa);
		nueva.calcularArea();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElPerimetroDelTrianguloRectangulo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double catetoOpuesto = 3.0;
		Double catetoAdyacente = 8.0;
		Double hipotenusa = 9.0;
		TrianguloRectangulo nueva = new TrianguloRectangulo(base, altura, catetoOpuesto, catetoAdyacente, hipotenusa);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 20.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElPerimetroDelTrianguloRectanguloSiAlgunLadoEsNegativo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double catetoOpuesto = 3.0;
		Double catetoAdyacente = 8.0;
		Double hipotenusa = -9.0;
		TrianguloRectangulo nueva = new TrianguloRectangulo(base, altura, catetoOpuesto, catetoAdyacente, hipotenusa);
		nueva.calcularPerimetro();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElAreaDelRectangulo() {
		Double ancho = 7.0;
		Double alto = 3.0;
		Rectangulo nueva = new Rectangulo(ancho, alto);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 21.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElAreaDelRectanguloSiElAnchoEsNegativo() {
		Double ancho = -7.0;
		Double alto = 3.0;
		Rectangulo nueva = new Rectangulo(ancho, alto);
		nueva.calcularArea();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElPerimetroDelRectangulo() {
		Double ancho = 7.0;
		Double alto = 3.0;
		Rectangulo nueva = new Rectangulo(ancho, alto);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 20.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElPerimetroDelRectanguloSiElAnchoEsNegativo() {
		Double ancho = -7.0;
		Double alto = 3.0;
		Rectangulo nueva = new Rectangulo(ancho, alto);
		nueva.calcularPerimetro();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElAreaDelCuadrado() {
		Double lado = 3.0;
		Cuadrado nueva = new Cuadrado(lado);
		Double valorObtenido = nueva.calcularArea();
		Double valorEsperado = 9.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElAreaDelCuadradoSiElLadoEsNegativo() {
		Double lado = -3.0;
		Cuadrado nueva = new Cuadrado(lado);
		nueva.calcularArea();
		assertFalse(nueva.pudoCalcular());
	}

	@Test
	public void queSePuedaCalcularElPerimetroDelCuadrado() {
		Double lado = 3.0;
		Cuadrado nueva = new Cuadrado(lado);
		Double valorObtenido = nueva.calcularPerimetro();
		Double valorEsperado = 12.0;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}

	@Test
	public void queNoSePuedaCalcularElPerimetroDelCuadradoSiElLadoEsNegativo() {
		Double lado = -3.0;
		Cuadrado nueva = new Cuadrado(lado);
		nueva.calcularPerimetro();
		assertFalse(nueva.pudoCalcular());
	}
	
	@Test
	public void queSePuedaCalcularUnAngulo() {
		Double base = 10.0;
		Double altura = 20.0;
		Double catetoOpuesto = 4.0;
		Double catetoAdyacente = 3.0;
		Double hipotenusa = 5.0;
		TrianguloRectangulo nueva = new TrianguloRectangulo(base, altura, catetoOpuesto, catetoAdyacente, hipotenusa);
		Double valorObtenido = nueva.calcularAngulo(catetoOpuesto, catetoAdyacente);
		Double valorEsperado = 53.13;
		assertEquals(valorObtenido, valorEsperado, 0.01);
	}
}
