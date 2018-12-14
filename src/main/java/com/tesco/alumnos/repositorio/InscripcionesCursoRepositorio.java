package com.tesco.alumnos.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.tesco.alumnos.modelo.InscripcionesCurso;
import com.tesco.alumnos.modelo.InscripcionesCursoPK;


public interface InscripcionesCursoRepositorio extends CrudRepository<InscripcionesCurso, InscripcionesCursoPK>{

}
