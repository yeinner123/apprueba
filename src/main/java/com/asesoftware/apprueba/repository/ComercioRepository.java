package com.asesoftware.apprueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asesoftware.apprueba.entity.Comercio;

public interface ComercioRepository extends JpaRepository<Comercio, Integer> {
	
}
