/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesco.alumnos.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 *
 * @author DANIEL BOTERO
 */
@Embeddable
public class InscripcionesCarreraPK implements Serializable {

    @Basic(optional = false)
    
    @Column(name = "idalumno")
    private int idalumno;
    @Basic(optional = false)
    
    @Column(name = "idcarrera")
    private int idcarrera;

    public InscripcionesCarreraPK() {
    }

    public InscripcionesCarreraPK(int idalumno, int idcarrera) {
        this.idalumno = idalumno;
        this.idcarrera = idcarrera;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idalumno;
        hash += (int) idcarrera;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InscripcionesCarreraPK)) {
            return false;
        }
        InscripcionesCarreraPK other = (InscripcionesCarreraPK) object;
        if (this.idalumno != other.idalumno) {
            return false;
        }
        if (this.idcarrera != other.idcarrera) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesco.alumnos.modelo.InscripcionesCarreraPK[ idalumno=" + idalumno + ", idcarrera=" + idcarrera + " ]";
    }
    
}
