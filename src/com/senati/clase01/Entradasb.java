package com.senati.clase01;

import javax.swing.JOptionPane;

public class Entradasb {

	public static void main(String[] args) {
		float altura1 = 0f;
		int altura2 = 0;
		String dni;
		byte edad = 0;
		char sexo = ' ';
		
		altura1 = Float.parseFloat(JOptionPane.showInputDialog("introduce altura en metros -> "));			
		altura2 = Integer.parseInt(JOptionPane.showInputDialog("introduce altura en centimetros -> "));			
		dni = JOptionPane.showInputDialog("introduce dni -> ");			
		edad = Byte.parseByte(JOptionPane.showInputDialog("introduce edad -> "));					
		sexo = JOptionPane.showInputDialog("introduce sexo -> ").charAt(0);
			        
		System.out.println("altura en metros -> " + altura1);
		System.out.println("altura en centimetros -> " + altura2);
		System.out.println("dni -> " + dni);
		System.out.println("edad -> " + edad);
		System.out.println("sexo -> " + sexo);
	}
}
