/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3.classi;
import java.util.ArrayList;

/**
 * @author mattia
 */
public class Venditore extends Utente{
    /* Attributi */
    private ArrayList<Auto> autoVenditore = new ArrayList<Auto>();
    
    // Costruttore
    public Venditore(){
        super();
    }
    
    // Metodi
    public ArrayList<Auto> getAutoVenditore() {
        return autoVenditore;
    }
    
    public void setAutoVenditore(ArrayList<Auto> autoInVendita){
        this.autoVenditore=autoInVendita;
    }
}

