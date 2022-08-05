package com.examen.figura.interfaz;

public class Triangulo implements Figura {

	float b;
	float h;

	public Triangulo(float b, float h) {
		super();
		this.b = b;
		this.h = h;
	}

	@Override
	public float areaFigura() {
		return (float) ((b * h) / 2);// (base * altura)/2
	}

	@Override
	public String toString() {
		return "Base(" + b + "cm) y" + " Altura(" + h + "cm)";
	}

}
