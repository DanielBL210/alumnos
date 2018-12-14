/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesco.alumnos.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DANIEL BOTERO
 */
@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByIdentificador", query = "SELECT a FROM Alumno a WHERE a.identificador = :identificador"),
    @NamedQuery(name = "Alumno.findByLegajo", query = "SELECT a FROM Alumno a WHERE a.legajo = :legajo")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    
    @Column(name = "identificador")
    private Integer identificador;
    @Basic(optional = false)
    
    @Column(name = "legajo")
    private int legajo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<InscripcionesCarrera> inscripcionesCarreraList;
    @JoinColumn(name = "idpersona", referencedColumnName = "identificador")
    @OneToOne
    private Persona idpersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<InscripcionesCurso> inscripcionesCursoList;

    public Alumno() {
    }

    public Alumno(Integer identificador) {
        this.identificador = identificador;
    }

    public Alumno(Integer identificador, int legajo) {
        this.identificador = identificador;
        this.legajo = legajo;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @XmlTransient
    public List<InscripcionesCarrera> getInscripcionesCarreraList() {
        return inscripcionesCarreraList;
    }

    public void setInscripcionesCarreraList(List<InscripcionesCarrera> inscripcionesCarreraList) {
        this.inscripcionesCarreraList = inscripcionesCarreraList;
    }

    public Persona getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Persona idpersona) {
        this.idpersona = idpersona;
    }

    @XmlTransient
    public List<InscripcionesCurso> getInscripcionesCursoList() {
        return inscripcionesCursoList;
    }

    public void setInscripcionesCursoList(List<InscripcionesCurso> inscripcionesCursoList) {
        this.inscripcionesCursoList = inscripcionesCursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificador != null ? identificador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.identificador == null && other.identificador != null) || (this.identificador != null && !this.identificador.equals(other.identificador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tesco.alumnos.modelo.Alumno[ identificador=" + identificador + " ]";
    }
    
}
