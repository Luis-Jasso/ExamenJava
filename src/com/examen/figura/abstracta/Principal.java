package com.examen.figura.abstracta;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {


		System.out.println("Ejemplo con abstracción");
		System.out.println("Todos los valores estan expresados en cm");
		System.out.println();

		Figura circulo = new Circulo(5f);
		//System.out.println("El Area del circulo con " + circulo.toString() + " es de: " + circulo.areaFigura() + "cm²");

		Figura cuadrado = new Cuadrado(5f);
		//System.out.println(
				//"El Area del cuadrado con " + cuadrado.toString() + " es de: " + cuadrado.areaFigura() + "cm²");

		Figura triangulo = new Triangulo(4f, 6f);
		//System.out.println(
				//"El Area del triangulo con " + triangulo.toString() + " es de: " + triangulo.areaFigura() + "cm²");

		Figura trapecio = new Trapecio(8f, 4f, 4f);
		//System.out.println("El Area del trapecio con " + trapecio.toString() + " es: " + trapecio.areaFigura() + "cm²");

		List<Figura> figuras = new ArrayList<>();
		figuras.add(circulo);
		figuras.add(cuadrado);
		figuras.add(triangulo);
		figuras.add(trapecio);
		
		
		calcularAreaFigura(figuras);

	}

	public static void calcularAreaFigura(List<Figura> fig) {

		for (Figura f : fig) {
			System.out.println();
			System.out.println("El Area del " + f.getClass().getSimpleName() + " con " + f.toString() + " es de: "
					+ f.areaFigura() + "cm²");
		}
	}

}
