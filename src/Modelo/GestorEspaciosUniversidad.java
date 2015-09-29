/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Zerling
 */
public class GestorEspaciosUniversidad
{

    /**
     * aqui VAN LOS ATRIBUTOS
     * 
     * 
     * 
     */
    private ArrayList<Recurso> recursos;
    private ArrayList<Evento> eventos;
    
    /**
     * 
     * AQUI VA EL CONSTRUCTOR
     * 
     * 
     */
    public GestorEspaciosUniversidad()
    {
        this.recursos = new ArrayList<>();
    }
    
    public Evento crearEvento(String nombre, String tipo, String responsable, Calendar fecha)
    {
        return new Evento(nombre, tipo, responsable, fecha);
    }
    
    public void addEvento(Evento evento)
    {
        this.eventos.add(evento);
    }
    
    public void recursoPorFecha()
    {
        
    }
    
    public void recursoDisponible()
    {
        for (int i = 0; i < recursos.size(); i++)
        {
            for (int j = 0; j < recursos.get(i).getSalas().size(); j++)
            {
                
            }
            
        }
    }
    public void recursoNoDisponible()
    {
        for (int i = 0; i < recursos.size(); i++)
        {
            for (int j = 0; j < recursos.get(i).getSalas().size(); j++)
            {
                
            }
            
        }
    }
    
    public void mostrarPorBloque()
    {
        
    }
    
    public void mostrarPorHorario()
    {
        
    }
    
    public void mostrarPorFecha(Calendar inicio, Calendar fin)
    {
        
    }

}
