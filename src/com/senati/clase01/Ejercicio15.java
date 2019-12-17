package com.senati.clase01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio15 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		float haber = Float.parseFloat(JOptionPane.showInputDialog("Ingrese haber b�sico: "));
		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese n�mero de faltas: "));
				
		float dscto = (float) ((faltas >= 2) ? 0.05 : 0) * haber;
		
		System.out.println("Haber b�sico : " + df.format(haber));
		System.out.println("Descuento    : " + df.format(dscto));
		System.out.println("Haber final  : " + df.format(haber - dscto));
	}
}


