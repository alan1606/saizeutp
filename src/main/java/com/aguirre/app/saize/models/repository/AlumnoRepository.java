package com.aguirre.app.saize.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aguirre.app.saize.models.entity.Alumno;

@Repository
public interface AlumnoRepository 
extends CrudRepository<Alumno, Long>
{

	
}
