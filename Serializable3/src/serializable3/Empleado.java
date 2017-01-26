/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializable3;

import java.io.*;

public class Empleado extends Persona{
    
    protected float HorasTrabajadas;
    private final float PrecioHoraDefecto = 5.5f;
    private float PrecioHora = PrecioHoraDefecto;
    
    public Empleado(String n, String a, int e, float s, float h){
        super(n,a,e,s);
        HorasTrabajadas = h;
    }
    
    public void setPrecioHora(float p){
        
        PrecioHora = p;
    }
    
    public float getHorasTrabajadas(){
        
        return HorasTrabajadas;
    }
    public float getPrecioHora(){
        
        return PrecioHora;
    }
}
