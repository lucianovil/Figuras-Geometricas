package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Circulo;
import src.Cuadrado;
import src.Paint;
import src.TrianguloEscaleno;

public class PaintTest {

	@Test
	public void QueSePuedaCrearElPaint() {
		Paint nuevo = new Paint();
		assertNotNull(nuevo);
	}
	
	@Test
	public void QueSePuedaAgregarUnaFiguraGeometricaEnElPaint() {
		Paint nuevo = new Paint();
		TrianguloEscaleno miTriangulo = new TrianguloEscaleno(5.0, 3.0, 2.0, 2.5, 4.0);
		nuevo.agregarFiguraGeometrica(miTriangulo);
		assertNotNull(nuevo);
	}
	
	@Test
	public void QueSePuedanAgregarMuchasFigurasGeometricasEnElPaint() {
		Paint nuevo = new Paint();
		TrianguloEscaleno miTriangulo = new TrianguloEscaleno(5.0, 3.0, 2.0, 2.5, 4.0);
		nuevo.agregarFiguraGeometrica(miTriangulo);
		Circulo miCirculo = new Circulo(6.0);
		nuevo.agregarFiguraGeometrica(miCirculo);
		Cuadrado miCuadrado = new Cuadrado(10.0);
		nuevo.agregarFiguraGeometrica(miCuadrado);
		Integer valorObtenido = nuevo.getFigurasGeometricas().size();
		Integer valorEsperado = 3;
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

	@Test
	public void QueSePuedaEliminarUnaFiguraGeometricaEnElPaint() {
		Paint nuevo = new Paint();
		TrianguloEscaleno miTriangulo = new TrianguloEscaleno(5.0, 3.0, 2.0, 2.5, 4.0);
		nuevo.agregarFiguraGeometrica(miTriangulo);
		Circulo miCirculo = new Circulo(6.0);
		nuevo.agregarFiguraGeometrica(miCirculo);
		Cuadrado miCuadrado = new Cuadrado(10.0);
		nuevo.agregarFiguraGeometrica(miCuadrado);
		nuevo.eliminarFiguraGeometrica(miCirculo);
		Integer valorObtenido = nuevo.getFigurasGeometricas().size();
		Integer valorEsperado = 2;
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
}
