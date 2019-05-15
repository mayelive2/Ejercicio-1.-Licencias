/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Licencia {
    
    private String email;
    private LocalDate fecha;
    private String codigo;
    private ArrayList<Licencia> transacciones;
    private int numeroTrans;
    private boolean revocada;
    private String servicio;

    public Licencia(String email, LocalDate fecha, String codigo, ArrayList<Licencia> transacciones, int numeroTrans, boolean revocada, String servicio) {
        this.email = email;
        this.fecha = fecha;
        this.codigo = codigo;
        this.transacciones = transacciones;
        this.numeroTrans = numeroTrans;
        this.revocada = revocada;
        this.servicio = servicio;
    }
    
    public revocar (){
        
        
        return; 
        
        if(eliminado != null){
            .remove(eliminado);
            //System.out.println("cancelado");
            return true;
        }
        
    }
    
    
    
    
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Licencia> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Licencia> transacciones) {
        this.transacciones = transacciones;
    }

    public int getNumeroTrans() {
        return numeroTrans;
    }

    public void setNumeroTrans(int numeroTrans) {
        this.numeroTrans = numeroTrans;
    }

    public boolean isRevocada() {
        return revocada;
    }

    public void setRevocada(boolean revocada) {
        this.revocada = revocada;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    
    
    
}
