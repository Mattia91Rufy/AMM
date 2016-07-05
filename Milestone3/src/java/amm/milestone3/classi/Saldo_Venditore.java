/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3.classi;

/**
 * @author mattia
 */
public class Saldo_Venditore extends Utente{
    double saldoVenditore;
    
    public Saldo_Venditore(){
        super();
        saldoVenditore=0;
    }
    
    public double getSaldoVenditore(){
        return saldoVenditore;
    }
    
    public void setSaldoVenditore(double saldoVenditore){
        this.saldoVenditore=saldoVenditore;
    }    
}
