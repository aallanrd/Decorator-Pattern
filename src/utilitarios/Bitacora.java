/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class Bitacora {
    
    private final Bitacoreo bitacoreo;
    public final ArrayList<Dto> cola ;
    
    public Bitacora(){
        cola = new ArrayList<>();
        bitacoreo = new Bitacoreo(cola);
        bitacoreo.start();
    }
    
    public void añadirCola(Dto dto){
        
        cola.add(dto);
        //Guardar en Archivo
            
    }
    
    
    
    
    
    
}
