/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejemploestructurarecursividad;
import java.io.File;

/**
 *
 * @author casa
 */
public class EjemploEstructuraRecursividad {

    public static void main(String[] args) {
        int numero = 5;
        int factorial = Factorial.factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        factorial = Factorial.factorialRecursivo(5);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        int numerosConsecutivos = NumeroConsecutivo.numConsecutivosRecursivo(numero);
        System.out.println("Numero consecutivo " + numero + ":" + numerosConsecutivos );
        
        int base = 2;
        int exponente = 3;
        int resultado = Potencia.potenciaRecursiva(base, exponente);
        System.out.println(base + "elevado a la " + exponente + "es igual a: " + resultado);
        
        String path = "C:\\Users\\ACER\\OneDrive\\Escritorio\\RD";
        File mainPath = new File(path);
        Directorio.renombrarCarpetas(mainPath);
    }
}
