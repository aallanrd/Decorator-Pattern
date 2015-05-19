/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author Allan
 */
public class Dto {
    
    String txt;
    String textoEncr;
    
    String tipo ;

    public Dto() {
    }

    public Dto(String txt, String textoEncr,String tipo) {
        this.txt = txt;
        this.textoEncr = textoEncr;
        this.tipo = tipo;
    }
    
    @Override
    public  String toString(){
        return ("TextoNormal:" + this.txt + " Texto Encriptado:" + this.textoEncr);
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getTextoEncr() {
        return textoEncr;
    }

    public void setTextoEncr(String textoEncr) {
        this.textoEncr = textoEncr;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
