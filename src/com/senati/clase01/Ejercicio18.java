package com.senati.clase01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
				
		float monto= Float.parseFloat(JOptionPane.showInputDialog("Ingrese monto: "));
		byte edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese edad: "));
		
		float dscto = 0;
		
		if (edad < 18)
			dscto = 0.15f;
		else if (edad > 60)
			dscto = 0.3f;
		
		System.out.println("Monto       : " + df.format(monto));
		System.out.println("Edad        : " + edad);
		System.out.println("Descuento   : " + df.format(monto * dscto));
		System.out.println("Monto final : " + df.format(monto - monto * dscto));
	}
}


