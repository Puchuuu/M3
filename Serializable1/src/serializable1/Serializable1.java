/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable1;

import java.io.*;
import java.util.*;

public class Serializable1{

    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        
        int op1, op2;
        Vector Cuentas = new Vector (20,5);
        
        do{
            op1 = Menu1();
            switch(op1){
                case 1:
                    break;
                case 2:
                    File f = new File("cuentas.obj");
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    Cuentas.addElement(new Cuenta);
                    break;
                case 3:
                    op2 = Menu2();
                    break;
                case 0:
                    break;
            }
        }while(op1!=0);
    }
    
    public static int Menu1(){
        
        int opcion;
        
        System.out.println("************ M E N U ***********");
        System.out.println("1. Ver cuentas");
        System.out.println("2. Crear nueva cuenta");
        System.out.println("3. Gestionar cuenta");
        System.out.println("0. Salir");
        
        opcion = teclado.nextInt();
        
        return opcion;        
    }
    
    public static int Menu2(){
        
        int opcion;
        
        System.out.println("*********** M E N U ************");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Sacar dinero");
        System.out.println("3. Trasnferir dinero");
        System.out.println("0. Salir");
        
        opcion = teclado.nextInt();
        
        return opcion;
    }
    
    
}
