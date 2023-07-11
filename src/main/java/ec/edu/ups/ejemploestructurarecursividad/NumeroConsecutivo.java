/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructurarecursividad;

/**
 *
 * @author casa
 */
public class NumeroConsecutivo {
    
    public static int numConsecutivosRecursivo(int n) {
        System.out.println("Calculando numero (" + n + ")");
        if (n == 0) {
            System.out.println("Alcanzado caso base");
            return 0;
        } else {
            int numeroNMinus1 = numConsecutivosRecursivo(n - 1);
            int factorialN = n + numeroNMinus1;

            System.out.println("Numero concsecutivo de " + n + " es: (" + (n - 1) + ")");
            return factorialN;
        }
    }
}
