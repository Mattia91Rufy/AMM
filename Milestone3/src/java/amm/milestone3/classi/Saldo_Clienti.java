/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3.classi;

/**
 * @author mattia
 */
public class Saldo_Clienti extends Utente{
    double saldoCliente;
    
    public Saldo_Clienti(){
        super();
        saldoCliente=0;
    }
    
    public double getSaldoCliente(){
        return saldoCliente;
    }
    
    public void setSaldoCliente(double saldoCliente){
        this.saldoCliente=saldoCliente;
    }
}
