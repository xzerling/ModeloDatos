/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Zerling
 */
public class Evento
{
    private String nombreEvento;
    private String tipoEvento;
    private String responsable;
    private Bloque bloque;
    private Calendar fechaUso;

    public Evento(String nombreEvento, String tipoEvento, String responsable, Calendar fechaUso)
    {
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.responsable = responsable;
        this.fechaUso = fechaUso;
    }

    public String getNombreEvento()
    {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento)
    {
        this.nombreEvento = nombreEvento;
    }

    public String getTipoEvento()
    {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento)
    {
        this.tipoEvento = tipoEvento;
    }

    public String getResponsable()
    {
        return responsable;
    }

    public void setResponsable(String responsable)
    {
        this.responsable = responsable;
    }

    public Calendar getFechaUso()
    {
        return fechaUso;
    }

    public void setFechaUso(Calendar fechaUso)
    {
        this.fechaUso = fechaUso;
    }
    
    
}
