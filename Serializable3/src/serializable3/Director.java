/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable3;

import java.io.*;

public class Director extends Persona{
    
    private String [] Departamentos = {"Marketing","RRLL","Atencion al Cliente"};
    protected int Departamento;
    
    public Director(String n, String a, int e, float s, int d)
    {
        super(n,a,e,s);
        Departamento = d;
    }
    
    public int getDepartamento(){
        
        return Departamento;
    }
    
}
