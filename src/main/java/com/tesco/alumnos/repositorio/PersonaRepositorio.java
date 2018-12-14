package com.tesco.alumnos.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.tesco.alumnos.modelo.Persona;

public interface PersonaRepositorio extends CrudRepository<Persona, Integer>{

}
