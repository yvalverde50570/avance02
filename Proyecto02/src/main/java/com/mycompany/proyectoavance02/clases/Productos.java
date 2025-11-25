/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoavance02.clases;

import com.mycompany.proyectoavance02.enumeradores.Categorias;

/**
 *
 * @author bayro
 */
public class Productos {
    
    private int codigoPlato;
    private String nombre;
    private double precioVenta;
    private Categorias categoria;
    
    
public Productos(int codigoPlato, String nombre, double precioVenta, Categorias categoria){
    this.codigoPlato = codigoPlato;
    this.nombre = nombre;
    this.precioVenta = precioVenta;
    this.categoria = categoria;
}

public int getCodigoPlato(){ return codigoPlato;}
public String getNombre(){ return nombre;}
public double getPrecioVenta(){ return precioVenta;}
public Categorias getCategoria(){ return categoria;}

public void setCodigoPlato(int codigoPlato){ this.codigoPlato = codigoPlato;}
public void setNombre(String nombre){ this.nombre = nombre;}
public void setPrecioVenta(double precioVenta){ this.precioVenta = precioVenta;}
public void setCategoria(Categorias categoria){ this.categoria = categoria;}

@Override
public String toString(){
    return "Codigo: " + codigoPlato +
           "\nNombre: " + nombre +
           "\nPrecio: " + precioVenta +
           "\nCategoria: " + categoria;
}
    
}
