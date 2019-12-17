package com.senati.clase01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sueldo;
		float descuento1;
		float descuento2;
		float descuento3;
		float total_sueldo;
		DecimalFormat df = new DecimalFormat("#.00");
		
		sueldo = Float.parseFloat(JOptionPane.showInputDialog("Sueldo -> "));
		descuento1 = sueldo * 0.1f;
		descuento2 = sueldo * 0.05f;
		descuento3 = (sueldo - descuento1 - descuento2) * 0.03f;
		total_sueldo = sueldo - descuento1 - descuento2 - descuento3;
		
		System.out.println("Sueldo       -> " + df.format(sueldo));
		System.out.println("Descuento 1  -> " + df.format(descuento1));
		System.out.println("Descuento 2  -> " + df.format(descuento2));
		System.out.println("Descuento 3  -> " + df.format(descuento3));
		System.out.println("Total sueldo -> " + df.format(total_sueldo));
	}

}
