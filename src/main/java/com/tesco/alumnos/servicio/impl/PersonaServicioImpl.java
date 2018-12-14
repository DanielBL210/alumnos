package com.tesco.alumnos.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tesco.alumnos.modelo.Persona;
import com.tesco.alumnos.repositorio.PersonaRepositorio;
import com.tesco.alumnos.servicio.PersonaServicio;

public class PersonaServicioImpl implements PersonaServicio{

	@Autowired
	private PersonaRepositorio personaRepositorio;

	@Override
	public void savePersona(Persona persona) {
		// TODO Auto-generated method stub
		personaRepositorio.save(persona);
	}

	@Override
	public void updatePersona(Persona persona) {
		// TODO Auto-generated method stub
		personaRepositorio.save(persona);
	}
	
	
	

}
