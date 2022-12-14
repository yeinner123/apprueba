package com.asesoftware.apprueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.asesoftware.apprueba.entity.Servicio;

@Repository("servicioRepository")
public interface ServicioRepository extends CrudRepository<Servicio, Integer>{
}
