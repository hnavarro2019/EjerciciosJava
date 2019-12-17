package com.senati.clase01;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado del cuadrado: "));
		
		int perimetro = lado * 4;
		int area =  (int) Math.pow(lado, 2);
		
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área     : " + area);
	}
}

