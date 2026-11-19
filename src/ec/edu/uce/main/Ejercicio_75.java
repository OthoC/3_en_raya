package ec.edu.uce.main;

import java.util.Scanner;

public class Ejercicio_75 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
        int pin = 0;

        for (int intentos = 1; intentos <= 3; intentos++) {

            System.out.println("Ingrese el PIN:");
            pin = sc.nextInt();

            if (pin == intentos) {
                System.out.println("PIN correcto. Bienvenido.");
                break;
            } else {
                System.out.println("PIN incorrecto.");

                if (intentos == 3) {
                    System.out.println("Excedió los intentos permitidos.");
                }
            }
        }

    }
}

