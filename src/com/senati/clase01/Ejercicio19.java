package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		int[] num_dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] nom_mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
		
		byte num_mes = Byte.parseByte(JOptionPane.showInputDialog("Ingrese mes [1 - 12]: "));
		
		System.out.println("Número ingresado : " + num_mes);
		System.out.println("Mes              : " + nom_mes[num_mes - 1]);
		System.out.println("Días             : " + num_dias[num_mes - 1]);
	}
}

