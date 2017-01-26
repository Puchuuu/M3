/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable1;

import java.io.Serializable;

/**
 *
 * @author Robb
 */
public class Cuenta implements Serializable{
    
    private int cont = 0;
    private int nCuenta;
    private String Propietario;
    private float Saldo;
    
    public Cuenta(){

    }
    public Cuenta(float dinero, String nombre){

        nCuenta = setnCuenta();
        Propietario = nombre;
        Saldo = dinero;
        cont++;
    }

    public void setPropietario(String nombre){
        
        Propietario = nombre;
    }
    public void setSaldo(float dinero){

        Saldo = dinero;
    }
    public int setnCuenta(){

        return cont;
    }
    
    public String getPropietario(){
        
        return Propietario;
    }
    public int getnCuenta(){
        
        return nCuenta;
    }
    public float getSaldo(){
        
        return Saldo;
    }
    
    public void Ingreso(float dinero){
        
        Saldo = Saldo+dinero;
        
    }
    
    public void Reintegro(float dinero){
        
        Saldo = Saldo-dinero;
    }
    
    //Obvio el metodo "Transferencia" porque cuando quiera hacerlo simplemente 
    //preguntare de que cuenta a que cuenta se quiere transferir y llamare a un metodo Ingreso y a un metodo reintegro
    
    public void consultaSaldo(){
        
        System.out.println("El saldo actual de tu cuenta es: "+Saldo);
    }
}
