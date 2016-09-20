/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import java.io.Serializable;

/**
 *
 * @author j
 */
public class Mensaje implements Serializable{
    private String cuerpo, remitente;

    public Mensaje(String cuerpo, String remitente) {
        this.cuerpo = cuerpo;
        this.remitente = remitente;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    
    
}
