/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Adrian
 */
public class Cliente implements /*Comparable<Cliente>,*/ Comparator<Cliente>{
    
    
    private String nombre;
    private String nroCuenta;
    private double saldo;

    
    
    public Cliente(String nombre, String nroCuenta, double saldo) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    Cliente() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nroCuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nroCuenta, other.nroCuenta)) {
            return false;
        }
        return true;
    }

    /*@Override
    public int compareTo(Cliente t) {
        return this.nombre - t.nombre;
    }*/

    @Override
    public int compare(Cliente t, Cliente t1) {
        return t.getNombre().compareTo(t1.getNombre());
    
    }

    
    
    
    
    
    
}
