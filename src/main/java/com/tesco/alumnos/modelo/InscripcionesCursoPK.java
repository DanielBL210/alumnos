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
public class InscripcionesCursoPK implements Serializable {

    @Basic(optional = false)
    
    @Column(name = "idalumno")
    private int idalumno;
    @Basic(optional = false)
    
    @Column(name = "idcurso")
    private int idcurso;

    public InscripcionesCursoPK() {
    }

    public InscripcionesCursoPK(int idalumno, int idcurso) {
        this.idalumno = idalumno;
        this.idcurso = idcurso;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idalumno;
        hash += (int) idcurso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InscripcionesCursoPK)) {
            return false;
        }
        InscripcionesCursoPK other = (InscripcionesCursoPK) object;
        if (this.idalumno != other.idalumno) {
            return false;
        }
        if (this.idcurso != other.idcurso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesco.alumnos.modelo.InscripcionesCursoPK[ idalumno=" + idalumno + ", idcurso=" + idcurso + " ]";
    }
    
}
