package com.asesoftware.apprueba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.asesoftware.apprueba.entity.Turno;
import com.asesoftware.apprueba.repository.TurnoRepository;

@Service("turnoService")
@Transactional
public class TurnoServicio implements ITurnoServicio{

	@Autowired
	@Qualifier("turnoRepository")
	private TurnoRepository turnoRepository;
	
	@Override
	public List<Turno> findAllTurno() {
		return (List<Turno>) turnoRepository.findAll();
	}

	@Override
	public Turno saveTurno(Turno turno) {
		return turnoRepository.save(turno);
	}

}
