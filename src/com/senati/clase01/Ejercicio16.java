package com.senati.clase01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		final float entrada = 12;
		
		String dia = JOptionPane.showInputDialog("Ingrese día: ");
		byte edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese edad: "));
		
		float dscto = 0;
		
		if (dia.equals("Martes") && edad < 25)
			dscto = 0.25f;
		else if (dia.equals("Miércoles") && edad > 60)
			dscto = 0.4f;
		else if (dia.equals("Jueves"))
			dscto = 0.2f;
		
		System.out.println("Día elegido              : " + dia);
		System.out.println("Precio de entrada normal : " + df.format(entrada));
		System.out.println("Descuento                : " + df.format(entrada * dscto));
		System.out.println("Precio de entrada final  : " + df.format(entrada - entrada * dscto));
	}
}

