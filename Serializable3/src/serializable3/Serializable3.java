/*
3. Crea una clase Persona. Crea tres clases heredadas: Empleado, Administrativo i 
Director. Establece los atributos y mètodos que creas conveniente. Crea un menú 
que permita añadir empleados, administrativos y directores nuevos. El programa 
guardarà todos los objetos cuando se seleccione la opción salir del menú. Cuando
se ejecute el programa cargarà todos los objetos guardados para volver al estado
en el que se dejò el programa. Una opción del menú será mostrar todos los empleados existentes.
 */
package serializable3;

import java.util.*;
import java.io.*;

public class Serializable3 {
    
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        File f = new File("Personas.obj");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int opcion1, opcion2, i;
        
        do{
            opcion1 = Menu1();
            switch(opcion1)
            {
                case 1:
                    
                    ObjectInputStream ois = null;
                    
                    try{
                        FileInputStream fis = new FileInputStream(f);
                        ois = new ObjectInputStream(fis);
                        
                        System.out.println("*********** E M P L E A D O S ********");
                        while(true){
                            Empleado e = (Empleado) ois.readObject();
                            System.out.println("Nombre: "+e.Nombre);
                            System.out.println("Apellidos: "+e.Apellidos);
                            System.out.println("Edad: "+e.Edad);
                            System.out.println("Sueldo :"+e.Sueldo);
                        }
                    }catch(IOException io){
                        System.out.println("\n************ F I N **********");
                    }finally{
                        ois.close();
                    }
                    break;
                case 2:
                    
                    String Nombre, Apellidos;
                    int Edad, SS, Planta, Departamento;
                    float Sueldo, Horas;
                    
                    opcion2 = Menu2();
                    switch(opcion2)
                    {
                        case 1:
                            System.out.println("Escribe el nombre del nuevo empleado: ");
                            Nombre = teclado.next();
                            System.out.println("Escribe los apellidos del nuevo empleado: ");
                            Apellidos = teclado.next();
                            System.out.println("Dime la edad del nuevo empleado: ");
                            Edad = teclado.nextInt();
                            System.out.println("Dime el sueldo del nuevo empleado: ");
                            Sueldo = teclado.nextFloat();
                            System.out.println("Dime las horas trabajadas: ");
                            Horas = teclado.nextFloat();
                            oos.writeObject(new Empleado(Nombre,Apellidos,Edad,Sueldo,Horas));
                            oos.close();
                            break;
                        case 2:
                            System.out.println("Escribe el nombre del nuevo administrativo: ");
                            Nombre = teclado.next();
                            System.out.println("Escribe los apellidos del nuevo administrativo: ");
                            Apellidos = teclado.next();
                            System.out.println("Dime la edad del nuevo administrativo: ");
                            Edad = teclado.nextInt();
                            System.out.println("Dime el sueldo del nuevo administrativo: ");
                            Sueldo = teclado.nextFloat();
                            System.out.println("Dime la planta en la que trabajará: ");
                            Planta = teclado.nextInt();
                            System.out.println("Dime en el departamento que trabajara: ");
                            System.out.println("Imprimir array de departamentos");
                            Departamento = teclado.nextInt();
                            oos.writeObject(new Administrativo(Nombre,Apellidos,Edad,Sueldo,Planta,Departamento));
                            break;
                        case 3:
                            System.out.println("Escribe el nombre del nuevo director: ");
                            Nombre = teclado.next();
                            System.out.println("Escribe los apellidos del nuevo director: ");
                            Apellidos = teclado.next();
                            System.out.println("Dime la edad del nuevo director: ");
                            Edad = teclado.nextInt();
                            System.out.println("Dime el sueldo del nuevo director: ");
                            Sueldo = teclado.nextFloat();
                            System.out.println("Dime en el departamento en el que trabajará: ");
                            System.out.println("Impresion de departamentos");
                            Departamento = teclado.nextInt();                            
                            oos.writeObject(new Director(Nombre,Apellidos,Edad,Sueldo,Departamento));
                            break;
                        case 0:
                            System.out.println("Salir");
                            break;
                        default:
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    break;
            }
        }while(opcion1 != 0);
        
    }
    
    public static int Menu1(){
        
        int op;
        
        System.out.println("*********** M E N U  **************");
        System.out.println("1. Ver empleados existentes");
        System.out.println("2. Anyadir empleado");
        System.out.println("0. Salir");
        System.out.println("************************************");
        System.out.println("");
        
        op = teclado.nextInt();
        
        return op;
    }
    
    public static int Menu2(){
        
        int op;
        
        System.out.println("*********** M E N U  **************");
        System.out.println("1. Anyadir empleado");
        System.out.println("2. Anyadir Administrativo");
        System.out.println("3. Anyadir Director");
        System.out.println("0. Salir");
        System.out.println("************************************");
        System.out.println("");
        
        op = teclado.nextInt();
        
        return op;
    }
}
