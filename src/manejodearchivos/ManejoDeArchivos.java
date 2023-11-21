/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejodearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author mauro
 */
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
    
}
