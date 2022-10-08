package com.asesoftware.apprueba.repository;

import com.asesoftware.apprueba.model.Comercio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComercio extends CrudRepository<Comercio, Integer>{

}
