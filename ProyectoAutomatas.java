
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;


public class ProyectoAutomatas {
    static int palabrasTotales;
    static int lineasTotales;
    
    public static void main(String[] args) {
        // VARIABLE PARA LLEVAR EL CONTADOR DE PALABRAS
        palabrasTotales = 0;
        
        // VARIABLE PARA LLEVAR EL CONTADOR DE LINEAS
        lineasTotales = 0;
        
        // OBJETO ARCHIVO CON LA RUTA DEL ARCHIVO A LEER
        File archivo = new File("C:\\Users\\gonza\\OneDrive\\Documentos\\GitHub\\Java\\TXT\\prueba1.txt");
        
        // LLAMADA AL METODO PARA CONTAR LAS PALABRAS Y LAS LINEAS
        contarPalabrasLineas(archivo);
    }
    
    // METODO QUE LEE EL ARCHIVO Y CUENTA LAS PALABRAS Y LAS LINEAS
    public static void contarPalabrasLineas(File archivo) {
        try {
            // SI EXISTE EL ARCHIVO
            if(archivo.exists()) {
                // ABRE LECTURA
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
                
                String lineaLeida;
                
                // MIENTRAS LA LINEA LEIDA NO SEA NULL
                while((lineaLeida = archivoLeer.readLine()) != null) {
                    System.out.println(lineaLeida);
                    
                    // CONTAMOS LAS PALABRAS DE LA LINEA
                    StringTokenizer st = new StringTokenizer(lineaLeida);
                    
                    // AUMENTA EL CONTADOR DE LINEAS Y DE PALABRAS
                    lineasTotales = lineasTotales + 1;
                    palabrasTotales = palabrasTotales + st.countTokens();
                }
                System.out.println("");
                System.out.println("Numero de palabras: " + palabrasTotales);
                System.out.println("Lineas totales: " + lineasTotales);
                
                // CIERRA LA LECTURA
                archivoLeer.close();
            } else {
                System.out.println("NO EXISTE EL ARCHIVO");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

