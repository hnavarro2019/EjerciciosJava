package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		int dias = 0;
		int km = 0;
		
		dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese d�as: "));
		km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese kil�metros: "));
		
		float pago = dias * 30;
		float adicional = (km > 2000) ? 0.4f * (km - 2000) : 0;
		
		float total = pago + adicional;
		
		System.out.println("D�as alquilados: " + dias);
		System.out.println("Km recorridos: " + km);
		System.out.println("Pago total: " + total);
	}
}


