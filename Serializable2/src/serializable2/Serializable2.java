/*
2. Crea una clase Libro con los métodos Titulo, Autor, numPaginas, Precio y 
añoPublicacion. La clase contendrá un constructor por defecto, un constructor 
con parámetros y los métodos getters y setters. Crea un menú que permita añadir 
libros nuevos. El programa guardarà todos los objetos cuando se seleccione la 
opción salir del menú. Cuando se ejecute el programa cargarà todos los objetos 
guardados para volver al estado en el que se dejò el programa. Una opción del 
menú será mostrar todos los libros actuales con su información.
 */
package serializable2;
import java.util.*;

public class Serializable2 {

    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        int op;
        
        do{
            op = Menu();
            switch(op){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
            }
        }while(op!=0);
    }
    
    public static int Menu(){
        
        int opcion;
        
        System.out.println(" = = = = = = = M E N U = = = = = =");
        System.out.println("1. Ver Libros");
        System.out.println("2. Anyadir Libro");
        System.out.println("0. Salir");
        
        opcion = teclado.nextInt();
        
        return opcion;
    }
}
