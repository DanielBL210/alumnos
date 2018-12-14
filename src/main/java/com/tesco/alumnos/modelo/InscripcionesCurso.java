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
@Table(name = "inscripciones_curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InscripcionesCurso.findAll", query = "SELECT i FROM InscripcionesCurso i"),
    @NamedQuery(name = "InscripcionesCurso.findByIdalumno", query = "SELECT i FROM InscripcionesCurso i WHERE i.inscripcionesCursoPK.idalumno = :idalumno"),
    @NamedQuery(name = "InscripcionesCurso.findByIdcurso", query = "SELECT i FROM InscripcionesCurso i WHERE i.inscripcionesCursoPK.idcurso = :idcurso"),
    @NamedQuery(name = "InscripcionesCurso.findByFechainscripcion", query = "SELECT i FROM InscripcionesCurso i WHERE i.fechainscripcion = :fechainscripcion")})
public class InscripcionesCurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InscripcionesCursoPK inscripcionesCursoPK;
    @Basic(optional = false)
    
    @Column(name = "fechainscripcion")
    @Temporal(TemporalType.DATE)
    private Date fechainscripcion;
    @JoinColumn(name = "idcurso", referencedColumnName = "identificador", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Curso curso;
    @JoinColumn(name = "idalumno", referencedColumnName = "identificador", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumno alumno;

    public InscripcionesCurso() {
    }

    public InscripcionesCurso(InscripcionesCursoPK inscripcionesCursoPK) {
        this.inscripcionesCursoPK = inscripcionesCursoPK;
    }

    public InscripcionesCurso(InscripcionesCursoPK inscripcionesCursoPK, Date fechainscripcion) {
        this.inscripcionesCursoPK = inscripcionesCursoPK;
        this.fechainscripcion = fechainscripcion;
    }

    public InscripcionesCurso(int idalumno, int idcurso) {
        this.inscripcionesCursoPK = new InscripcionesCursoPK(idalumno, idcurso);
    }

    public InscripcionesCursoPK getInscripcionesCursoPK() {
        return inscripcionesCursoPK;
    }

    public void setInscripcionesCursoPK(InscripcionesCursoPK inscripcionesCursoPK) {
        this.inscripcionesCursoPK = inscripcionesCursoPK;
    }

    public Date getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(Date fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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
        hash += (inscripcionesCursoPK != null ? inscripcionesCursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InscripcionesCurso)) {
            return false;
        }
        InscripcionesCurso other = (InscripcionesCurso) object;
        if ((this.inscripcionesCursoPK == null && other.inscripcionesCursoPK != null) || (this.inscripcionesCursoPK != null && !this.inscripcionesCursoPK.equals(other.inscripcionesCursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesco.alumnos.modelo.InscripcionesCurso[ inscripcionesCursoPK=" + inscripcionesCursoPK + " ]";
    }
    
}
