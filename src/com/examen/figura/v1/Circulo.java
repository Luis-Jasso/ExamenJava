package com.examen.figura.v1;

public class Circulo implements Figura {

	public float radio;

	public Circulo(float radio) {
		this.radio = radio;
	}

	@Override
	public float areaFigura() {

		return (float) (Math.PI * Math.pow(radio, 2)); // π*r*r
	}

	@Override
	public String toString() {
		return "radio(" + radio + "cm)";
	}

}