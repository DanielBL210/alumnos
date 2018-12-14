/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesco.alumnos.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DANIEL BOTERO
 */
@Entity
@Table(name = "inscripciones_carrera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InscripcionesCarrera.findAll", query = "SELECT i FROM InscripcionesCarrera i"),
    @NamedQuery(name = "InscripcionesCarrera.findByIdalumno", query = "SELECT i FROM InscripcionesCarrera i WHERE i.inscripcionesCarreraPK.idalumno = :idalumno"),
    @NamedQuery(name = "InscripcionesCarrera.findByIdcarrera", query = "SELECT i FROM InscripcionesCarrera i WHERE i.inscripcionesCarreraPK.idcarrera = :idcarrera"),
    @NamedQuery(name = "InscripcionesCarrera.findByFechainscripcion", query = "SELECT i FROM InscripcionesCarrera i WHERE i.fechainscripcion = :fechainscripcion")})
public class InscripcionesCarrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InscripcionesCarreraPK inscripcionesCarreraPK;
    @Basic(optional = false)
    
    @Column(name = "fechainscripcion")
    @Temporal(TemporalType.DATE)
    private Date fechainscripcion;
    @JoinColumn(name = "idcarrera", referencedColumnName = "identificador", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Carrera carrera;
    @JoinColumn(name = "idalumno", referencedColumnName = "identificador", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumno alumno;

    public InscripcionesCarrera() {
    }

    public InscripcionesCarrera(InscripcionesCarreraPK inscripcionesCarreraPK) {
        this.inscripcionesCarreraPK = inscripcionesCarreraPK;
    }

    public InscripcionesCarrera(InscripcionesCarreraPK inscripcionesCarreraPK, Date fechainscripcion) {
        this.inscripcionesCarreraPK = inscripcionesCarreraPK;
        this.fechainscripcion = fechainscripcion;
    }

    public InscripcionesCarrera(int idalumno, int idcarrera) {
        this.inscripcionesCarreraPK = new InscripcionesCarreraPK(idalumno, idcarrera);
    }

    public InscripcionesCarreraPK getInscripcionesCarreraPK() {
        return inscripcionesCarreraPK;
    }

    public void setInscripcionesCarreraPK(InscripcionesCarreraPK inscripcionesCarreraPK) {
        this.inscripcionesCarreraPK = inscripcionesCarreraPK;
    }

    public Date getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(Date fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inscripcionesCarreraPK != null ? inscripcionesCarreraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InscripcionesCarrera)) {
            return false;
        }
        InscripcionesCarrera other = (InscripcionesCarrera) object;
        if ((this.inscripcionesCarreraPK == null && other.inscripcionesCarreraPK != null) || (this.inscripcionesCarreraPK != null && !this.inscripcionesCarreraPK.equals(other.inscripcionesCarreraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesco.alumnos.modelo.InscripcionesCarrera[ inscripcionesCarreraPK=" + inscripcionesCarreraPK + " ]";
    }
    
}
