package Arreglos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		boolean jugador1 = true;
		
		Tablero tablero = new Tablero();
		tablero.imprimirTablero();
		
		Scanner sc = new Scanner(System.in);
		char caracter = 'X';
		
		while(true) {
			
			if(jugador1) {
				System.out.println("Turno del jugador 1");
				caracter = 'X';
				jugador1 = false;

			}else {
				System.out.println("Turno del jugador 2");
				caracter = 'O';
				jugador1 = true;

			}
			
			System.out.println("Ingresa la fila");
			int fila = sc.nextInt();
			
			System.out.println("Ingrese la columna");
			int columna = sc.nextInt();
			
			tablero.asignarValor(fila, columna, caracter);
			System.out.println("");
			tablero.imprimirTablero();
			
		}
		
	}

}
