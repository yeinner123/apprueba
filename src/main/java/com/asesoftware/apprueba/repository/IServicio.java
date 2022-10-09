package com.asesoftware.apprueba.repository;

import com.asesoftware.apprueba.model.Servicio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicio extends CrudRepository<Servicio, Integer>{

	Servicio findByidServicio(Integer id);
	
}
