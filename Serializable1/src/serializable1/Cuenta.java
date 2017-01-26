/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable1;

/**
 *
 * @author Robb
 */
public class Cuenta {
    
    private int cont = 0;
    private int nCuenta;
    private float Saldo;
    
    public Cuenta(){

    }
    public Cuenta(float dinero){

        nCuenta = cont;
        Saldo = dinero;
        cont++;
    }

    public void setSaldo(float dinero){

        Saldo = dinero;
    }
    public void setnCuenta(){

        nCuenta = cont;
        cont++;
    }
    
    public void Ingreso(float dinero){
        
        Saldo = Saldo+dinero;
        
    }
    
    public void Reintegro(float dinero){
        
        Saldo = Saldo-dinero;
    }
    
    //Obvio el metodo "Transferencia" porque cuando quiera hacerlo simplemente 
    //preguntare de que cuenta a que cuenta se quiere transferir y llamare a un metodo Ingreso y a un metodo reintegro
    
    public void consultaSaldo(){//Se considera el metodo getter para el Saldo
        
        System.out.println("El saldo actual de tu cuenta es: "+Saldo);
    }
}
