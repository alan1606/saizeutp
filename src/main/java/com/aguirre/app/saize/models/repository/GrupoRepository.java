/**
 * 
 */
package com.aguirre.app.saize.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aguirre.app.saize.models.entity.Grupo;

/**
 * @author Alan
 *
 */
@Repository
public interface GrupoRepository 
extends CrudRepository<Grupo, Long>
{

}
