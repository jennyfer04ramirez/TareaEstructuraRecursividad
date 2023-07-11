/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructurarecursividad;

/**
 *
 * @author casa
 */
public class Factorial {

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(resultado + " * " + i);
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecursivo(int n) {
        /*
        if (n == 0) {
            return 1;
        } else {
            System.out.println(resultado + "*" + i);
            return n * factorialRecursivo(n - 1);
        }
        */ 
        System.out.println("Calculando factorial (" + n + ")");
        if (n == 0) {
            System.out.println("Alcanzado caso base: factorial(0) = 1");
            return 1;
        } else {
            int factorialNMinus1 = factorialRecursivo(n - 1);
            int factorialN = n * factorialNMinus1;

            System.out.println("Factorial parcial de " + n + ": factorial (" + (n - 1) + ")");
            return factorialN;
        }
    }
}