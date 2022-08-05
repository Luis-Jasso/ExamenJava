package com.examen.figura.interfaz;

public class Cuadrado implements Figura {

	private float mLado;

	public Cuadrado(float mLado) {
		this.mLado = mLado;
	}

	@Override
	public float areaFigura() {
		return (float) (Math.pow(mLado, 2)); //L*L
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Lado(" + mLado + "cm) ";
	}

}
