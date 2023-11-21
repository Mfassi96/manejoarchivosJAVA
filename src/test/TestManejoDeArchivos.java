
package test;


import javax.swing.JOptionPane;
import static manejodearchivos.ManejoDeArchivos.*;


public class TestManejoDeArchivos {
    
    public static void main(String[] args) {
       String url="C:\\Users\\mauro\\Desktop\\";
//        //creo un nombre simple para el archivo
//       String nombre=JOptionPane.showInputDialog("Ingresa el nombre y extension del archivo");
//        
//        //creo el nombre final para el archivo y su ruta
//        var nombrearchivo=url+nombre; 
//        crearArchivo(nombrearchivo);
//        
//        //Creo el contenido del archivo
//        String contenido=JOptionPane.showInputDialog("Ingrese el contenido");
//        
//        // escribo en el archivo ese contenido
//        escribirArchivo(nombrearchivo,contenido);
//        
//        //pregunto si desea agregar nueva informacion
//        int conf=JOptionPane.showInternalConfirmDialog(null, "Desea agregar informacion");
//        
//        //en caso verdadero se muestra una nueva ventana para anexar informacion
//        if(conf == 0){
//                    String nuevocontenido=JOptionPane.showInputDialog("Ingrese nuevo contenido");
//                    agregarinfo(nombrearchivo, nuevocontenido);
//        }else{
//            JOptionPane.showMessageDialog(null, "Su archivo esta listo en \n" +url);
//        }
//        

        leerArchivo(url +"unidad1.pdf");
        
    }
    
}
