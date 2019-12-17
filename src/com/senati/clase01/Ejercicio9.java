package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Primer número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Tercer número: "));
		
		if ((num1 + num2 == num3) || (num1 + num3 == num2) || (num2 + num3 == num1))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
	}
}

