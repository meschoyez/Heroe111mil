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
public class Honda {
    
    
    private int AlcancePiedraPequeña;
    private int AlcancePiedraMediana;
    private int AlcancePiedraGrande;
    private Piedra piedra;
    
    

    public Honda() {
        setAlcancePiedraPequeña(15);
        setAlcancePiedraMediana(10);
        setAlcancePiedraGrande(5);
    }
    
    public Piedra CargarHonda() throws PiedraNoDisponibleException{
        
        if (piedra.equals(piedra.getPiedraPequeña())) {
            
            piedra = piedra.getPiedraPequeña();
            return piedra;
            
        }else if (piedra.equals(piedra.getPiedraMediana())) {
            
            piedra = piedra.getPiedraMediana();
            return piedra;
        }else if (piedra.equals(piedra.getPiedraGrande())) {
            
            piedra = piedra.getPiedraGrande();
            return piedra;
            
        }else{
            throw new PiedraNoDisponibleException("No tiene piedras disponibles.");
        }
    
       
    }
    
    public Piedra ArrojarPiedra() throws PiedraNoDisponibleException{
        
        if (piedra.equals(piedra.getPiedraPequeña())) {
            
            piedra.getDañoPiedraPequeña();
            getAlcancePiedraPequeña();
            return piedra.getPiedraPequeña();
            
        } else if (piedra.equals(piedra.getPiedraMediana())) {
            
            piedra.getDañoPiedraMediana();
            getAlcancePiedraMediana();
            return piedra.getPiedraMediana();
            
        } else if (piedra.equals(piedra.getPiedraGrande())) {
            
            piedra.getDañoPiedraGrande();
            getAlcancePiedraGrande();
            return piedra.getPiedraGrande();
            
        } else {
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

    
    
}
