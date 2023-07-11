/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructurarecursividad;
import java.io.File;

/**
 *
 * @author casa
 */
public class Directorio {
    public static void renombrarCarpetas (File path){
        if (path.isDirectory()){
            String pathName = path.getName() + "hola";
            File newPath = new File(path.getParentFile(), pathName);
            System.out.println(newPath);
            path.renameTo(newPath);
            
            File [] subDirectorios = newPath.listFiles();
            if (subDirectorios != null){
                renombrarSubCarpetas(subDirectorios, 0);
            }
        }

    }

    public static void renombrarSubCarpetas(File[] subDirectorios, int i) {
        if(i < subDirectorios.length){
            File subDirectorio = subDirectorios[i];
            renombrarCarpetas(subDirectorio);
            renombrarSubCarpetas(subDirectorios, i+1);
        }
    }
}
