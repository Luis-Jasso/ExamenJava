package com.examen.figura.v1;

public class Trapecio implements Figura {

	private float baseMayor;
	private float baseMenor;
	private float altura;

	public Trapecio(float baseMayor, float baseMenor, float altura) {
		super();
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	@Override
	public float areaFigura() {
		// TODO Auto-generated method stub
		return (float) (((baseMayor + baseMenor) * altura) / 2);// ((B+b)*h)/2
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BM(" + baseMayor + "cm)" + "-bM(" + baseMenor + "cm)-" + "Altura(" + altura + "cm)";
	}

}
