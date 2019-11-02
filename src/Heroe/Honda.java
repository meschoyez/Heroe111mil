/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroe;

/**
 *
 * @author Fede
 */
public class Honda extends Armas {
    
    private int PESO_HONDA = 2;
    private int AlcancePiedraPequeña;
    private int AlcancePiedraMediana;
    private int AlcancePiedraGrande;
    private Piedra piedra;
    
    
    public Honda() throws PiedraNoDisponibleException {
        
        setNombre("Honda");
        setPeso(PESO_HONDA);
        setAlcance(piedra.Alcance());
        setDanio(piedra.Daño());
        
     }
    
    public Piedra CargarHonda() throws PiedraNoDisponibleException{
        
        if (piedra.equals(piedra.getPiedraPequeña())) {
            setPeso(piedra.PesoPiedra()+ PESO_HONDA);
            return piedra;
            
        }else if (piedra.equals(piedra.getPiedraMediana())) {
            setPeso(piedra.PesoPiedra()+ PESO_HONDA);
            return piedra;
            
        }else if (piedra.equals(piedra.getPiedraGrande())) {
            setPeso(piedra.PesoPiedra()+ PESO_HONDA);
            return piedra;
            
        }else{
            throw new PiedraNoDisponibleException("No tiene piedras disponibles.");
        }
    
       
    }

    public int getAlcancePiedraPequeña() {
        return AlcancePiedraPequeña;
    }

    public void setAlcancePiedraPequeña(int AlcancePiedraPequeña) {
        this.AlcancePiedraPequeña = AlcancePiedraPequeña;
    }

    public int getAlcancePiedraMediana() {
        return AlcancePiedraMediana;
    }

    public void setAlcancePiedraMediana(int AlcancePiedraMediana) {
        this.AlcancePiedraMediana = AlcancePiedraMediana;
    }

    public int getAlcancePiedraGrande() {
        return AlcancePiedraGrande;
    }

    public void setAlcancePiedraGrande(int AlcancePiedraGrande) {
        this.AlcancePiedraGrande = AlcancePiedraGrande;
    }

    @Override
    public void Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecargarArma(Objetos obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
