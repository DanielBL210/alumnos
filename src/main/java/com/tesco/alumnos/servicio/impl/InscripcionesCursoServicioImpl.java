package com.tesco.alumnos.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tesco.alumnos.modelo.InscripcionesCurso;
import com.tesco.alumnos.repositorio.InscripcionesCursoRepositorio;
import com.tesco.alumnos.servicio.InscripcionesCursoServicio;

public class InscripcionesCursoServicioImpl implements InscripcionesCursoServicio{

	@Autowired
	private InscripcionesCursoRepositorio inscripcionesCursoRepositorio;

	@Override
	public void guardarInscripcion(InscripcionesCurso inscripcionesCurso) {
		// TODO Auto-generated method stub
		inscripcionesCursoRepositorio.save(inscripcionesCurso);
	}

	
	

}
