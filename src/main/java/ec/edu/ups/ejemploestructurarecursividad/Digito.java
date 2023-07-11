/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructurarecursividad;

/**
 *
 * @author casa
 */
public class Digito {
    public static int sumaDigitosNumeros(int numero){
        if (numero == 0){
            return numero;
        }else {
            int residuo = sumaDigitosNumeros(numero/10);
            int respuesta = (numero%10) +residuo;
            return respuesta;
        }
    }
}
