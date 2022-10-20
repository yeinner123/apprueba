package com.asesoftware.apprueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.asesoftware.apprueba.entity.Turno;

@Repository
public interface ITurno extends CrudRepository<Turno, Integer>{

}
