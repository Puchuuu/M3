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
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        int op1, op2;
        File f = new File("cuentas.obj");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        do{
            op1 = Menu1();
            switch(op1){
                case 1:
                    
                    ObjectInputStream ois = null;
                    
                    try{
                        ois = new ObjectInputStream(fis);
                        while(true){
                            Cuenta Cuentas = (Cuenta) ois.readObject();
                            System.out.println("Nombre: \t\t"+Cuentas.getPropietario());
                            System.out.println("N Cuenta: \t\t"+Cuentas.getnCuenta());
                            System.out.println("Saldo : \t\t"+Cuentas.getSaldo());
                            System.out.println("************************************");
                        }                        
                    }
                    catch(IOException io){
                        System.out.println("******** F I N ************");
                    }
                    finally{
                        ois.close();
                    }
                    break;
                case 2:
                    float dinero;
                    String nombre;
                    
                    System.out.println("Cuanto dinero vas a meter en la cuenta para abrirla?");
                    dinero = teclado.nextFloat();
                    System.out.println("Nombre del propietario de la cuenta: ");
                    nombre = teclado.next();
                    anyadirCuenta(f,dinero,nombre);
                    oos.writeObject(new Cuenta(dinero,nombre));
                    oos.close();
                    break;
                case 3:
                    op2 = Menu2();
                    switch(op2){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            System.out.println("Gestion de cuenta finalizada");
                            break;
                    }
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
    
    public static void anyadirCuenta(File Cuentas, float dinero, String nombre) throws FileNotFoundException, IOException, ClassNotFoundException{//abrir fichero, copiar cosas a vector. Anyadir lo necesario a vector y copiar vector de nuevo en fichero
        
        ObjectInputStream ois = null;
        
        try{
            Vector copiaCuentas = new Vector();
            FileInputStream fis = new FileInputStream(Cuentas);
            ois = new ObjectInputStream(fis);
            while(true){
                //Cuenta c = (Cuenta) ois.readObject();
                Vector c = (Vector) ois.readObject();
                copiaCuentas = c;
            }
            copiaCuentas.addElement(new Cuenta(dinero,nombre));

            FileOutputStream fos = new FileOutputStream(Cuentas);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i=0;i<copiaCuentas.size();i++){

                System.out.println(((Cuenta)copiaCuentas.elementAt(i)).+" | ");          
            }
        }
        catch(IOException io){
            System.out.println("Fichero copiado satisfactoriamente");
        }
        finally{
            ois.close();
        }
        
    }
}
