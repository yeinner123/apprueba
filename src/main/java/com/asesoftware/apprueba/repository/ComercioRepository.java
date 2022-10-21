package com.asesoftware.apprueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.asesoftware.apprueba.entity.Comercio;

@Repository("comercioRepository")
public interface ComercioRepository extends CrudRepository<Comercio, Integer> {
}
