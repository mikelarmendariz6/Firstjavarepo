package org.cuatrovientos.entornos.ejemplomaven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculadora {
    public static void main( String[] args )
    {
    	Scanner leer = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese una operación matemática válida (suma, resta, multiplicacion, division) o 'salir' para terminar:");
            String operacion = leer.nextLine();

            switch (operacion.toLowerCase()) {
			
			  case "suma": suma(); break;
			 
                case "resta":
                    resta();
                    break;
                case "multiplicacion":
                    realizarMultiplicacion();
                    break;
                case "division":
                    realizarDivision();
                    break;
                case "salir":
                    continuar = false;
                    break;
                default:
                    System.out.println("Operación no válida. Por favor, ingrese una operación válida.");
                    break;
            }
        }

        System.out.println("Gracias");
    }

    private static void suma() {
        // Lógica para realizar la suma
        System.out.println("Ingrese el primer número:");
        double num1 = obtenerNumero();

        System.out.println("Ingrese el segundo número:");
        double num2 = obtenerNumero();

        double resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    private static void resta() {
        // Lógica para realizar la resta
        System.out.println("Ingrese el primer número:");
        double num1 = obtenerNumero();

        System.out.println("Ingrese el segundo número:");
        double num2 = obtenerNumero();

        double resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    private static void realizarMultiplicacion() {
        // Lógica para realizar la multiplicación
        System.out.println("Ingrese el primer número:");
        double num1 = obtenerNumero();

		
		  System.out.println("Ingrese el segundo número:"); double num2 =
		  obtenerNumero();
		 

        double resultado = num1 * num2;
        System.out.println("Resultado de la multiplicación: " + resultado);
    }

    private static void realizarDivision() {
        // Lógica para realizar la división
        System.out.println("Ingrese el numerador:");
        double numerador = obtenerNumero();

        System.out.println("Ingrese el denominador (distinto de cero):");
        double denominador;
        do {
            denominador = obtenerNumero();
            if (denominador == 0) {
                System.out.println("El denominador no puede ser cero. Ingrese otro valor.");
            }
        } while (denominador == 0);

        double resultado = numerador / denominador;
        System.out.println("Resultado de la división: " + resultado);
    }

    private static double obtenerNumero() {
        Scanner leer = new Scanner(System.in);
        while (true) {
            try {
                return Double.parseDouble(leer.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }
}