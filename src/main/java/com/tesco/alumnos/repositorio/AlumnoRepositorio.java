package com.tesco.alumnos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tesco.alumnos.modelo.Alumno;

@Repository
public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer> {
	
	

}
