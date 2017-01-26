/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable3;

import java.io.*;

public class Administrativo extends Persona{

    static void addElement(Administrativo administrativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected int Planta;
    protected int Departamento;
    
    
    public Administrativo(String n, String a, int e, float s, int p, int d){
        
        super(n,a,e,s);
        Planta = p;
        Departamento = d;
    }
    
    public int getPlanta(){
        
        return Planta;
    }
    public int getDepartamento(){
        
        return Departamento;
    }
}
