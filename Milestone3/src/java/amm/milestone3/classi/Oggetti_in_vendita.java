/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3.classi;
import java.util.ArrayList;

/**
 *
 * @author mattia
 */
public class Oggetti_in_vendita extends Auto {
    /* Attributi */
    private ArrayList<Auto> autoInVendita = new ArrayList<Auto>();
    
    // Costruttore
    public Oggetti_in_vendita(){
        super();
    }
    
    // Metodi
    public ArrayList<Auto> getAuto_Vendita() {
        return autoInVendita;
    }
    
    public void setAuto_Vendita(ArrayList<Auto> autoInVendita){
        this.autoInVendita=autoInVendita;
    }
}
