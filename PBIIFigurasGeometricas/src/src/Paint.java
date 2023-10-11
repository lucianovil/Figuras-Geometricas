package src;

import java.util.ArrayList;

public class Paint {

	private ArrayList<FiguraGeometrica> figurasGeometricas;

	public Paint() {
		this.figurasGeometricas = new ArrayList<FiguraGeometrica>();
	}

	public ArrayList<FiguraGeometrica> getFigurasGeometricas() {
		return figurasGeometricas;
	}

	public void setFigurasGeometricas(ArrayList<FiguraGeometrica> figurasGeometricas) {
		this.figurasGeometricas = figurasGeometricas;
	}

	public void agregarFiguraGeometrica(FiguraGeometrica nuevaFigura) {
		this.figurasGeometricas.add(nuevaFigura);
	}
	
	public void eliminarFiguraGeometrica(FiguraGeometrica nuevaFigura) {
		this.figurasGeometricas.remove(nuevaFigura);
	}

}
