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
class Piedra extends Armas {
    
    private Piedra piedraPequeña;
    private Piedra piedraMediana;
    private Piedra piedraGrande;
    
    private int CantidadPiedraPequeña;
    private int CantidadPiedraMediana;
    private int CantidadPiedraGrande;
    
    private int DañoPiedraPequeña;
    private int DañoPiedraMediana;
    private int DañoPiedraGrande;
    
    private Piedra piedra;
    private Honda honda;

    public Piedra() throws PiedraNoDisponibleException {
        
        GenerarNombre();
        PesoPiedra();
        Daño();
        Cantidad();
        Alcance();
        
    }
    
    public int PesoPiedra() throws PiedraNoDisponibleException{
        
        if (this.equals(this.piedraPequeña)) {
            setPeso(2);
            return getPeso();
        }else if (this.equals(this.piedraMediana)) {
            setPeso(5);
            return getPeso();
        }else if (this.equals(this.piedraGrande)) {
            setPeso(8);
            return getPeso();
        }else{
            throw new PiedraNoDisponibleException("No tiene piedras disponibles.");
        }
        
    }
    
    public int Daño() throws PiedraNoDisponibleException{
        
        if (this.equals(this.piedraPequeña)) {
            setDañoPiedraPequeña(5);
            return this.getDañoPiedraPequeña();
        }else if (this.equals(this.piedraMediana)) {
            setDañoPiedraMediana(10);
            return this.getDañoPiedraMediana();
        }else if (this.equals(this.piedraGrande)) {
            setDañoPiedraGrande(15);
            return this.getDañoPiedraGrande();
        }else{
            throw new PiedraNoDisponibleException("No tiene piedras disponibles.");
        }
        
    }
    
    public int Cantidad() throws PiedraNoDisponibleException{
        
        if (this.equals(this.piedraPequeña)) {
            setCantidadPiedraPequeña(20);
            return this.getCantidadPiedraPequeña();
        }else if (this.equals(this.piedraMediana)) {
            setCantidadPiedraMediana(10);
            return this.getCantidadPiedraMediana();
        }else if (this.equals(this.piedraGrande)) {
            setCantidadPiedraGrande(5);
            return this.getCantidadPiedraGrande();
        }else{
            throw new PiedraNoDisponibleException("No tiene piedras disponibles.");
        }
    }
    
    public int Alcance() throws PiedraNoDisponibleException{
        
        if (this.equals(this.getPiedraPequeña())) {
            honda.setAlcancePiedraPequeña(15);
            return honda.getAlcancePiedraPequeña();
            
        } else if (this.equals(this.getPiedraMediana())) {
            honda.setAlcancePiedraMediana(10);
            return honda.getAlcancePiedraMediana();
            
        } else if (this.equals(this.getPiedraGrande())) {
            honda.setAlcancePiedraGrande(5);
            return honda.getAlcancePiedraGrande();
            
        } else {
            throw new PiedraNoDisponibleException("No tiene piedras disponibles.");
        }
    }
    
    public void GenerarNombre() throws PiedraNoDisponibleException{
        
        if (this.equals(this.getPiedraPequeña())) {
            piedra = this.piedraPequeña;
            System.out.println("Piedra Pequeña");
            
        } else if (this.equals(this.getPiedraMediana())) {
            this.piedra = this.piedraMediana;
            System.out.println("Piedra Mediana");
            
        } else if (this.equals(this.getPiedraGrande())) {
            this.piedra = this.piedraGrande;
            System.out.println("Piedra Grande");
            
        } else {
            throw new PiedraNoDisponibleException("No tiene piedras disponibles.");
        }
        
    }
   

    public int getCantidadPiedraPequeña() {
        return CantidadPiedraPequeña;
    }

    public void setCantidadPiedraPequeña(int CantidadPiedraPequeña) {
        this.CantidadPiedraPequeña = CantidadPiedraPequeña;
    }

    public int getCantidadPiedraMediana() {
        return CantidadPiedraMediana;
    }

    public void setCantidadPiedraMediana(int CantidadPiedraMediana) {
        this.CantidadPiedraMediana = CantidadPiedraMediana;
    }

    public int getCantidadPiedraGrande() {
        return CantidadPiedraGrande;
    }

    public void setCantidadPiedraGrande(int CantidadPiedraGrande) {
        this.CantidadPiedraGrande = CantidadPiedraGrande;
    }

    public Piedra getPiedraPequeña() {
        return piedraPequeña;
    }

    public Piedra getPiedraMediana() {
        return piedraMediana;
    }

    public Piedra getPiedraGrande() {
        return piedraGrande;
    }

    public int getDañoPiedraPequeña() {
        return DañoPiedraPequeña;
    }

    public void setDañoPiedraPequeña(int DañoPiedraPequeña) {
        this.DañoPiedraPequeña = DañoPiedraPequeña;
    }

    public int getDañoPiedraMediana() {
        return DañoPiedraMediana;
    }

    public void setDañoPiedraMediana(int DañoPiedraMediana) {
        this.DañoPiedraMediana = DañoPiedraMediana;
    }

    public int getDañoPiedraGrande() {
        return DañoPiedraGrande;
    }

    public void setDañoPiedraGrande(int DañoPiedraGrande) {
        this.DañoPiedraGrande = DañoPiedraGrande;
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
