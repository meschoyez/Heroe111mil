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
class Piedra {
    
    private Piedra piedraPequeña;
    private Piedra piedraMediana;
    private Piedra piedraGrande;
    
    private int CantidadPiedraPequeña;
    private int CantidadPiedraMediana;
    private int CantidadPiedraGrande;
    
    private int DañoPiedraPequeña;
    private int DañoPiedraMediana;
    private int DañoPiedraGrande;

    public Piedra() {
        setDañoPiedraGrande(15);
        setDañoPiedraMediana(10);
        setDañoPiedraPequeña(5);
        
        setCantidadPiedraPequeña(20);
        setCantidadPiedraMediana(10);
        setCantidadPiedraGrande(5);
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
    
   
    
    
}
