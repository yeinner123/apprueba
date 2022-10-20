package com.asesoftware.apprueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asesoftware.apprueba.model.Turno;

public interface TurnoDao extends JpaRepository<Turno, Integer> {

}
