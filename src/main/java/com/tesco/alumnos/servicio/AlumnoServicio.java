package com.tesco.alumnos.servicio;

import org.springframework.stereotype.Service;

import com.tesco.alumnos.modelo.Alumno;

public interface AlumnoServicio {
	void saveAlumno(Alumno alumno);
	void updateAlumno(Alumno alumno);
}
