/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable3;

import java.io.*;
import java.util.*;

public class Persona {
    
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;
    protected int SS;
    protected float Sueldo;
    
    public Persona(String n, String a, int e, float s){
        
        Nombre = n;
        Apellidos = a;
        Edad = e;
        SS = setSS();
        Sueldo = s;
    }
    
    public int setSS(){
        
        Random rnd = new Random();
        int num = (int)(rnd.nextInt()*999999+0);
        
        return num;
    }
    
    public String getNombre(){
        
        return Nombre;
    }
    public String getApellidos(){
        
        return Apellidos;
    }
    public int getEdad(){
        
        return Edad;
    }
    public int getSS(){
        
        return SS;
    }
}
