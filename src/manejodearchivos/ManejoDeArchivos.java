
package manejodearchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ManejoDeArchivos {
    
    public static void crearArchivo(String nombrearchivo){
        File miArchivo=new File(nombrearchivo);
        try {
            PrintWriter salida=new PrintWriter(miArchivo);
            
            //Guardar el archivo en memoria 
            salida.close();
            JOptionPane.showMessageDialog(null, "Se creo un archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombrearchivo, String contenido){
        File miArchivo=new File(nombrearchivo);
        try {
            PrintWriter salida=new PrintWriter(miArchivo);
            
            salida.println(contenido);
            //Guardar el archivo en memoria 
            salida.close();
            JOptionPane.showMessageDialog(null, "Se ha escrito en el archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void agregarinfo(String nombrearchivo, String contenido){
            File miArchivo=new File(nombrearchivo);       
        try {
            PrintWriter salida=new PrintWriter(new FileWriter(miArchivo,true));
            
            salida.println(contenido);
            //Guardar el archivo en memoria 
            salida.close();
            JOptionPane.showMessageDialog(null, "Se ha escrito en el archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombrearchivo){
        File archivo = new File(nombrearchivo);
        try {
            var entrada= new BufferedReader(new FileReader(archivo));
            try {
                var lectura =  entrada.readLine(); 
                while(lectura != null ){
                    System.out.println("lectura = " + lectura);
                    lectura=entrada.readLine();
                }
                entrada.close();
            } catch (IOException ex) {
                ex.printStackTrace();;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
    }
    }
    
}
