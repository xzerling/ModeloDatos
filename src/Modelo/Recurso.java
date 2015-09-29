/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Zerling
 */
public abstract class Recurso
{
    private String nombre;
    private int cantidadSalas;
    private ArrayList<Sala> salas;

    public Recurso(String nombre, int cantidadSalas)
    {
        this.nombre = nombre;
        this.cantidadSalas = cantidadSalas;
        this.salas = new ArrayList<>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getCantidadSalas()
    {
        return cantidadSalas;
    }

    public void setCantidadSalas(int cantidadSalas)
    {
        this.cantidadSalas = cantidadSalas;
    }

    public ArrayList<Sala> getSalas()
    {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas)
    {
        this.salas = salas;
    }
    
    public abstract boolean addSala(Sala sala);
    public abstract boolean removeSala(Sala sala);
    public abstract boolean mostrarSalas();

    
}