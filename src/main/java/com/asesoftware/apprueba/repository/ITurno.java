package com.asesoftware.apprueba.repository;

import com.asesoftware.apprueba.model.Turno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurno extends CrudRepository<Turno, Integer>{

	Turno findByIdTurno(Integer id);

}
