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
public class Error {
    String errore;
    
    public Error(){
        errore = "Username o Password sbagliati";
    }
    
    public String getError(){
        return errore;
    }
    
    public void setError(String errore){
        this.errore=errore;
    }
}
