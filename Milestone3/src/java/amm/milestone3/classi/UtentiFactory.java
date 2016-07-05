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
public class UtentiFactory {
    /*  Attributi */
    /** singleton assicura che venga creata un'unica istanza della classe 
     * all’interno del programma.
     */
    private static UtentiFactory singleton;
    public static UtentiFactory getInstance() {
        if (singleton == null){
            singleton = new UtentiFactory();
        }
        return singleton;
    }
    
    /* lista Auto */
    private ArrayList<Auto> ListaAuto = new ArrayList<Auto>();
    private ArrayList<Auto> CategoriaAuto = new ArrayList<Auto>();
    /* lista Utenti */
    private ArrayList<Utente> ListaUtenti = new ArrayList<Utente>();
    private ArrayList<Utente> ListaClienti = new ArrayList<Utente>();
    /* lista Venditori */
    private ArrayList<Utente> ListaVenditori = new ArrayList<Utente>();
    
    /* lista saldo venditori */
    private ArrayList<Saldo_Venditore> ListaSaldoVenditori = new ArrayList<Saldo_Venditore>();
    
    /* lista saldo clienti */
    private ArrayList<Saldo_Clienti> ListaSaldoClienti = new ArrayList<Saldo_Clienti>();
    
    private UtentiFactory(){
        
        //Macchine
        Auto auto_1 = new Auto();
        auto_1.setModello("Famigliare");
        auto_1.setCilindrata(2000);
        auto_1.setColore("Gray");
        auto_1.setnRuote(4);
        auto_1.setPrezzo(28000);
        auto_1.setIdCar(100);
        auto_1.setImage("images/famigliare.png");
        auto_1.setPezzi(7);
        auto_1.setDescrizione("Auto per uso famigliare. Fino a 7 posti");
        ListaAuto.add(auto_1);
        
        Auto auto_2 = new Auto();
        auto_2.setModello("Sportiva");
        auto_2.setCilindrata(3900);
        auto_2.setColore("Red");
        auto_2.setnRuote(4);
        auto_2.setPrezzo(57500);
        auto_2.setIdCar(101);
        auto_2.setImage("images/sportiva.png");
        auto_2.setPezzi(14);
        auto_2.setDescrizione("Un auto che è il rittrato della potenza! E' indomabile");
        ListaAuto.add(auto_2);
        
        Auto auto_3 = new Auto();
        auto_3.setModello("Rally");
        auto_3.setCilindrata(3000);
        auto_3.setColore("Blue");
        auto_3.setnRuote(4);
        auto_3.setPrezzo(35000);
        auto_3.setIdCar(102);
        auto_3.setImage("images/rally.png");
        auto_3.setPezzi(24);
        auto_3.setDescrizione("Terra, sabbia, fango ... Saranno come asfalto per questa macchina");
        ListaAuto.add(auto_3);
        
        Auto auto_4 = new Auto();
        auto_4.setModello("Galaxy");
        auto_4.setCilindrata(8666);
        auto_4.setColore("White");
        auto_4.setnRuote(0);
        auto_4.setPrezzo(476500);
        auto_4.setIdCar(103);
        auto_4.setImage("images/galaxy.png");
        auto_4.setPezzi(4);
        auto_4.setDescrizione("Astronave costruita insieme alla NASA, per la tratta Terra - Luna");
        ListaAuto.add(auto_4);
        
        Auto auto_5 = new Auto();
        auto_5.setModello("Motocicletta Z.Ej");
        auto_5.setCilindrata(1000);
        auto_5.setColore("White");
        auto_5.setnRuote(2);
        auto_5.setPrezzo(17350);
        auto_5.setIdCar(104);
        auto_5.setImage("images/motorbike.png");
        auto_5.setPezzi(11);
        auto_5.setDescrizione("Una motocicletta per veri bikers. Le penne non saranno più le stesse");
        ListaAuto.add(auto_5);
        
        Auto auto_6 = new Auto();
        auto_6.setModello("Motocross");
        auto_6.setCilindrata(600);
        auto_6.setColore("black");
        auto_6.setnRuote(2);
        auto_6.setPrezzo(14250);
        auto_6.setIdCar(105);
        auto_6.setImage("images/motocross.png");
        auto_6.setPezzi(14);
        auto_6.setDescrizione("Il motocross del futuro. Tony Cairoli ha detto SI !");
        ListaAuto.add(auto_6);
        
        Auto auto_7 = new Auto();
        auto_7.setModello("Scooter");
        auto_7.setCilindrata(75);
        auto_7.setColore("white");
        auto_7.setnRuote(2);
        auto_7.setPrezzo(5400);
        auto_7.setIdCar(106);
        auto_7.setImage("images/scooter.png");
        auto_7.setPezzi(31);
        auto_7.setDescrizione("Il 2 ruote per i giovani. Un ottimo regalo per i propri figli");
        ListaAuto.add(auto_7);
        
        Auto auto_8 = new Auto();
        auto_8.setModello("Scooterone");
        auto_8.setCilindrata(150);
        auto_8.setColore("gray");
        auto_8.setnRuote(2);
        auto_8.setPrezzo(8400);
        auto_8.setIdCar(107);
        auto_8.setImage("images/scooter2.png");
        auto_8.setPezzi(21);
        auto_8.setDescrizione("Ottimo 2 ruote per lunghi spostamenti e anche per la città. Molto comodo ma sempre grintoso");
        ListaAuto.add(auto_8);
        
        Auto auto_9 = new Auto();
        auto_9.setModello("Porsche");
        auto_9.setCilindrata(2500);
        auto_9.setColore("red");
        auto_9.setnRuote(4);
        auto_9.setPrezzo(40500);
        auto_9.setIdCar(108);
        auto_9.setImage("images/porsche.png");
        auto_9.setPezzi(21);
        auto_9.setDescrizione("Una Porsche non ha bisogno di presentazioni, ma solo di essere guidata");
        ListaAuto.add(auto_9);
        
        // Utenti
        Cliente utente_1 = new Cliente();
        utente_1.setNome("Gianni");
        utente_1.setCognome("Lai");
        utente_1.setPassword("0000");
        utente_1.setUsername("GianniLai");
        utente_1.setId(0);
        ListaClienti.add(utente_1);
        
        Cliente utente_2 = new Cliente();
        utente_2.setNome("Giorgio");
        utente_2.setCognome("Tommasi");
        utente_2.setPassword("0001");
        utente_2.setUsername("GioTommas");
        utente_2.setId(1);
        ListaClienti.add(utente_2);
        
        Cliente utente_3 = new Cliente();
        utente_3.setNome("Luis");
        utente_3.setCognome("Esteban");
        utente_3.setPassword("0002");
        utente_3.setUsername("Luis");
        utente_3.setId(2);
        ListaClienti.add(utente_3);
        
        Cliente utente_4 = new Cliente();
        utente_4.setNome("Maria");
        utente_4.setCognome("Lisci");
        utente_4.setPassword("0003");
        utente_4.setUsername("MariaLisci");
        utente_4.setId(3);
        ListaClienti.add(utente_4);
        
        Cliente utente_5 = new Cliente();
        utente_5.setNome("Enzo");
        utente_5.setCognome("Maresca");
        utente_5.setPassword("0004");
        utente_5.setUsername("Enzo");
        utente_5.setId(4);
        ListaClienti.add(utente_5);
        
        // Venditori
        Venditore venditore_1 = new Venditore();
        venditore_1.setNome("Luigi");
        venditore_1.setCognome("Cuccu");
        venditore_1.setUsername("LuigiCuccu");
        venditore_1.setPassword("1000");
        venditore_1.setId(100);
        ArrayList<Auto> arrayAutoVenditore_1 = new ArrayList<Auto>();
        arrayAutoVenditore_1.add(auto_1);
        arrayAutoVenditore_1.add(auto_2);
        venditore_1.setAutoVenditore(arrayAutoVenditore_1);
        ListaVenditori.add(venditore_1);
        
        Venditore venditore_2 = new Venditore();
        venditore_2.setNome("Gianna");
        venditore_2.setCognome("Salis");
        venditore_2.setUsername("GiannaSalis");
        venditore_2.setPassword("1001");
        venditore_2.setId(101);
        ArrayList<Auto> arrayAutoVenditore_2 = new ArrayList<Auto>();
        arrayAutoVenditore_2.add(auto_3);
        arrayAutoVenditore_2.add(auto_4);
        venditore_2.setAutoVenditore(arrayAutoVenditore_2);
        ListaVenditori.add(venditore_2);
        
        Venditore venditore_3 = new Venditore();
        venditore_3.setNome("Maria");
        venditore_3.setCognome("Di Nazaret");
        venditore_3.setUsername("madonnina");
        venditore_3.setPassword("1002");
        venditore_3.setId(102);
        ArrayList<Auto> arrayAutoVenditore_3 = new ArrayList<Auto>();
        arrayAutoVenditore_3.add(auto_5);
        arrayAutoVenditore_3.add(auto_6);
        venditore_3.setAutoVenditore(arrayAutoVenditore_3);
        ListaVenditori.add(venditore_3);
        
        Venditore venditore_4 = new Venditore();
        venditore_4.setNome("Maccio");
        venditore_4.setCognome("Capatonda");
        venditore_4.setUsername("mariottide");
        venditore_4.setPassword("1003");
        venditore_4.setId(103);
        ArrayList<Auto> arrayAutoVenditore_4 = new ArrayList<Auto>();
        arrayAutoVenditore_4.add(auto_7);
        arrayAutoVenditore_4.add(auto_8);
        venditore_4.setAutoVenditore(arrayAutoVenditore_4);
        ListaVenditori.add(venditore_4);
        
        Venditore venditore_5 = new Venditore();
        venditore_5.setNome("Mucho");
        venditore_5.setCognome("Gusto");
        venditore_5.setUsername("MuchoGusto");
        venditore_5.setPassword("1004");
        venditore_5.setId(104);
        ArrayList<Auto> arrayAutoVenditore_5 = new ArrayList<Auto>();
        arrayAutoVenditore_5.add(auto_9);
        venditore_5.setAutoVenditore(arrayAutoVenditore_5);
        ListaVenditori.add(venditore_5);
        
            
    }
    
    /* Metodi */

    /**
     *
     * @return
     */

    
    public ArrayList<Auto> getAutoList()
    {
        return ListaAuto;
    }
    
    
    public Auto getAuto(int id){
        for (Auto u : ListaAuto){
            if(u.idCar == id)
                return u;    
        }
        return null;
    }
    
    /*
        metodo per restituire gli elementi di una categoria
    */
    public ArrayList<Auto> getCategoria(int nRuote){
        for(Auto u : ListaAuto){
            if(u.nRuote == nRuote)
                CategoriaAuto.add(u);
        }
        return CategoriaAuto;
    }
    
    
    public ArrayList<Utente> getUtentiList(){
        ArrayList<Utente> ListaUtenti = new ArrayList<Utente>();
        
        ListaUtenti.addAll(ListaVenditori);
        ListaUtenti.addAll(ListaClienti);
        
        return ListaUtenti;
    }
    
    /*public Utente getUtente(int id){
        for(Utente u : ListaUtenti){
            if(u.id == id)
                return u;
        }
        return null;
    }*/
    
    /**
     *
     * @return
     */
    public ArrayList<Utente> getVenditoriList(){
        return ListaVenditori;
    }
    
    public Utente getVenditori(int id){
        for(Utente u : ListaVenditori){
            if(u.id == id)
                return u;
        }
        return null;
    }
    
    public ArrayList<Utente> getClientiList(){
        return ListaClienti;
    }
    
    public Utente getClienti(int id){
        for(Utente u : ListaClienti){
            if(u.id == id)
                return u;
        }
        return null;
    }
    
    public ArrayList<Saldo_Venditore> getSaldoVenditore(){
        return ListaSaldoVenditori;
    }
    
    public Saldo_Venditore getSaldoVenditore(int id){
        for(Saldo_Venditore u : ListaSaldoVenditori){
            if(u.id == id)
                return u;
        }
        return null;
    }
    
    public ArrayList<Saldo_Clienti> getSaldoClienti(){
        return ListaSaldoClienti;
    }
    
    public Saldo_Clienti getSaldoClienti(int id){
        for(Saldo_Clienti u : ListaSaldoClienti){
            if(u.id == id)
                return u;
        }
        return null;
    }
}



