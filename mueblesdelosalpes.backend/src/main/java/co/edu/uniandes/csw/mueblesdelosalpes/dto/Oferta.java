/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author don_d
 */
public class Oferta {
   private int idOferta;
   private String comprador;
   private int mRef;
   private int oferta;

    public Oferta() {
    }
   
   public Oferta(int idOferta,String comprador,int mRef,int oferta){
       this.idOferta = idOferta;
       this.comprador=comprador;
       this.mRef=mRef;
       this.oferta = oferta;
   }

    

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public int getmRef() {
        return mRef;
    }

    public void setmRef(int mRef) {
        this.mRef = mRef;
    }
   
   
}
