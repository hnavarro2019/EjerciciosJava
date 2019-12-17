package com.senati.clase01;

//import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Ejercicio7 {

	//public static void main(String[] args) throws NumberFormatException, IOException {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.0");
		
		int n = 0, mayor = 0, menor = 20, suma=0;
		float promedio;
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        for (int i = 0; i < 4; i++) {
            //System.out.println("Ingresa un numero");
        	
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota " + (i + 1)));
            
            //n = Integer.parseInt(br.readLine());
            
            System.out.println("Nota " + (i + 1) + ": " + n);
            
            suma = suma + n;
            if (n > mayor)
            	mayor = n;
            
            if (n == 0 || n < menor)
                menor = n;
            
        }
        
        promedio = (suma - menor) / 3;
        
        System.out.println("===========================");
        System.out.println("---------Cálculos----------");
        System.out.println("===========================");
        System.out.println("El promedio es: " + promedio);
        System.out.println("La nota mayor es: " + df.format(mayor));
        System.out.println("La nota menor es: " + df.format(menor));
	}

}
