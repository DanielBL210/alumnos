package com.tesco.alumnos.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesco.alumnos.modelo.Alumno;
import com.tesco.alumnos.repositorio.AlumnoRepositorio;
import com.tesco.alumnos.servicio.AlumnoServicio;

@Service
public class AlumnoServicioImpl implements AlumnoServicio{

	@Autowired
	private AlumnoRepositorio alumnoRepositorio;

	@Override
	public void saveAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnoRepositorio.save(alumno);
	}

	@Override
	public void updateAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnoRepositorio.save(alumno);
	}
	
	

}
