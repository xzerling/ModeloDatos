/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author Zerling
 */
public class Sala
{
    private String id;
    private int capacidad;
    private Evento evento;
    private boolean disponible;
    private boolean proyector;
    private boolean calefaccion;

    public Sala(String id, int capacidad, boolean proyector, boolean calefaccion)
    {
        this.id = id;
        this.capacidad = capacidad;
        this.disponible = true;
        this.proyector = proyector;
        this.calefaccion = calefaccion;
        this.evento = null;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getCapacidad()
    {
        return capacidad;
    }

    public void setCapacidad(int capacidad)
    {
        this.capacidad = capacidad;
    }

    public boolean isProyector()
    {
        return proyector;
    }

    public void setProyector(boolean proyector)
    {
        this.proyector = proyector;
    }

    public boolean isCalefaccion()
    {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion)
    {
        this.calefaccion = calefaccion;
    }

    public boolean isDisponible()
    {
        return disponible;
    }

    public void setDisponible(boolean disponible)
    {
        this.disponible = disponible;
    }
    
    public void setEvento(Evento evento)
    {
        this.evento = evento;
    }
    
    public void borrarEvento()
    {
        this.evento = null;
    }
    
    
}