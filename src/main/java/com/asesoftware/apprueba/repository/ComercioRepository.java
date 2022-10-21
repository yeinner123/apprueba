package com.asesoftware.apprueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.asesoftware.apprueba.entity.Comercio;

@Repository("comercioRepository")
public interface ComercioRepository extends JpaRepository<Comercio, Integer> {
}
