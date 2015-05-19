/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import utilitarios.Bitacora;
import utilitarios.Dto;

/**
 *
 * @author Allan
 */
public abstract class EncriptaDecorator implements Algoritmos{

    protected Algoritmos decoratedShape;
    Bitacora bitacora;
    
    public EncriptaDecorator(Algoritmos decoratedShape, Bitacora bit){
        this.decoratedShape = decoratedShape;
        this.bitacora = bit;
    }
    
    @Override
    public String encriptar(String txt) {
      String encriptar = decoratedShape.encriptar(txt);
      enviaBitacora(txt,encriptar);
      return encriptar;
    }

    ////////////////////// Nuevas Funcionalidades ////////////////////
    void enviaBitacora (String txtNormal, String txtEncriptado){
        
       Dto dto = new Dto();
       dto.setTextoEncr(txtEncriptado);
       dto.setTxt(txtNormal);
       bitacora.añadirCola(dto);
       
        
    }
}
