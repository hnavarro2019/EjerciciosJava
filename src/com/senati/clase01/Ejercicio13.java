package com.senati.clase01;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Ejercicio13 {
	 
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		final float tipo = 3.57f;
		
		float monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese monto en soles: "));
		
		System.out.println("Monto en soles: " + df.format(monto));
		System.out.println("Monto en euros: " + df.format((monto / tipo)));
	}
}

