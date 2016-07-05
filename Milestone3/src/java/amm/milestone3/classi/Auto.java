/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3.classi;

/**
 *
 * @author mattia
 */
public class Auto {
    protected Integer idCar;
    protected String modello;
    protected String colore;
    protected Integer nRuote;
    protected Integer cilindrata;
    protected double prezzo;
    protected String image;
    protected Integer pezzi;
    protected String descrizione;
    
    public Integer getIdCar(){
        return idCar;
    }
    
    public void setIdCar(int idCar){
        this.idCar=idCar;
    }
    
    public String getDescrizione(){
        return descrizione;
    }
    
    public void setDescrizione(String descrizione){
        this.descrizione=descrizione;
    }
    
    public String getModello(){
        return modello;
    }
    
    public void setModello(String modello){
        this.modello=modello;
    }
    
    public String getColore(){
        return colore;
    }
    
    public void setColore(String colore){
        this.colore=colore;
    }
    
    public Integer getnRuote(){
        return nRuote;
    }
    
    public void setnRuote(int nRuote){
        this.nRuote=nRuote;
    }
    
    public Integer getCilindrata(){
        return cilindrata;
    }
    
    public void setCilindrata(int cilindrata){
        this.cilindrata=cilindrata;
    }
    
    public double getPrezzo(){
        return prezzo;
    }
    
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
   
    public String getImage(){
        return image;
    }
    
    public void setImage(String image){
        this.image=image;
    }
    
    public Integer getPezzi(){
        return pezzi;
    }
    
 
    public void setPezzi(int pezzi){
        this.pezzi=pezzi;
    }
}
