package Arreglos;


public class Tablero {
		
	int dimencion = 3;
	
	char[][] tablero = new char[dimencion][dimencion];

	public void imprimirTablero() {
		
		System.out.println("-------------");
		for (int i = 0; i < dimencion; i++) {
		    System.out.print("| ");
		    for (int j = 0; j < dimencion; j++) {
		        System.out.print(tablero[i][j] + " | ");
		    }
		    System.out.println(); 
		    System.out.println("-------------");
		}
		
	}
	
	public void asignarValor(int fila, int columna, char caracter) {
		tablero[fila][columna]=caracter;
	}
}


	
	
	