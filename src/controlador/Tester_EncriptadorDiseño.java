/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Algoritmos;
import utilitarios.Bitacora;
import modelo.BitacoraDecorator;
import modelo.operaciones.Transposicion;
import modelo.operaciones.Vigenere;

/**
 *
 * @author Allan
 */
public class Tester_EncriptadorDiseño {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bitacora miBitacora = new Bitacora();
        
        System.out.println("Vigenere");
        Algoritmos vigenere = new Vigenere();
        vigenere.encriptar("texto Encripta Vigenere");
        ////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Vigenere Bitacora");
        
        Algoritmos bitVigenere = new BitacoraDecorator(new Vigenere(),miBitacora);
        
        bitVigenere.encriptar("texto encripta Vigenere + Bitacora");
        
        System.out.println("");
        
        
        ////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Transposicion Bitacora");
        
        Algoritmos bitTransposicion = new BitacoraDecorator(new Transposicion(),miBitacora);
        
        bitTransposicion.encriptar("texto encripta Transp  + Bitacora");
        
        /////////////// Imprimo La Bitacora Global ////////////////////////
        imprimeBit(miBitacora);
        
        
    }
    
    public static void imprimeBit ( Bitacora bit){
        int size = bit.cola.size();
        for ( int i = 0; i< size ; i++){
            System.out.println(bit.cola.get(i).toString());
        }
    }

}
