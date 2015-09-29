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
public class Bloque
{
    private int numeroBloque;
    private Calendar hora;

    public Bloque(int numeroBloque, Calendar hora)
    {
        this.numeroBloque = numeroBloque;
        this.hora = hora;
    }

    public int getNumeroBloque()
    {
        return numeroBloque;
    }

    public void setNumeroBloque(int numeroBloque)
    {
        this.numeroBloque = numeroBloque;
    }

    public Calendar getHora()
    {
        return hora;
    }

    public void setHora(Calendar hora)
    {
        this.hora = hora;
    }
    
    
}
