package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		byte n1 = Byte.parseByte(JOptionPane.showInputDialog("Primer número: "));
		byte n2 = Byte.parseByte(JOptionPane.showInputDialog("Segundo número: "));
		
		int i = 0;
		
		for (int x = n1; x <= n2; x++) {
			if (x % 2 == 0) {
				i++;
				System.out.println("Valor " + (i + 1) + ": " + x);
			}
		}
	}
}

