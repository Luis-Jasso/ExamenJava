package com.examen.figura.abstracta;

public class Cuadrado extends Figura {

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
