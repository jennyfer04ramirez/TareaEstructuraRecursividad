/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructurarecursividad;

/**
 *
 * @author casa
 */
public class Potencia {

    public static int potenciaRecursiva(int base, int exponente) {
        System.out.println("Calculando potencia (" + base + ") ^ " + exponente);
        if (exponente == 0) {
            System.out.println("Alcanzado caso base");
            return 1;
        } else {
            int numeroNMinus1 = potenciaRecursiva(base, exponente - 1);
            int factorialN = base * numeroNMinus1;

            System.out.println(base + "elevado a" + exponente + " es: (" + factorialN + ")");
            return factorialN;
        }
    }
}
