package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		float num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese n�mero: "));
		
		float r1 = num * 2;
		float r2 = num * 3;
		float r3 = (float) Math.pow(num, 2);
		float r4 = (float) Math.pow(num, 3);
		
		System.out.println("Doble es    : " + r1);
		System.out.println("Triple es   : " + r2);
		System.out.println("Cuadrado es : " + r3);
		System.out.println("Cubo es     : " + r4);
	}
}

