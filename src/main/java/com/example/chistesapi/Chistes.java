
package com.example.chistesapi;


public class Chistes {
    private String texto;
    private String categoria;
    
    public Chistes(){
    }
    
    public Chistes(String texto,String categoria ){
        this.texto = texto;
        this.categoria= categoria;
    }
    public String getCategoria (){
        return categoria;
    }
    public void setCategoria (String categoria){
        this.categoria = categoria;
    }
    public void setTexto (String texto){
        this.texto = texto;
    }
    public String getTExto (){
        return texto;
    }
    
    
}
