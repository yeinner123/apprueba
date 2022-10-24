package com.asesoftware.apprueba.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.asesoftware.apprueba.converter.TurnoConverter;
import com.asesoftware.apprueba.entity.Turno;
import com.asesoftware.apprueba.entity.TurnoRequest;
import com.asesoftware.apprueba.entity.TurnoResponse;
import com.asesoftware.apprueba.repository.TurnoRepository;

@Service("turnoService")
@Transactional
public class TurnoServicio implements ITurnoServicio{

	@Autowired
	@Qualifier("turnoRepository")
	private TurnoRepository turnoRepository;
	
	@Autowired
    private TurnoConverter converter;
	
	@Override
	public List<Turno> findAllTurno() {
		return (List<Turno>) turnoRepository.findAll();
	}

	@Override
	public TurnoResponse saveTurno(TurnoRequest turnoRequest) {
		TurnoResponse turnoResponse = new TurnoResponse();
		Turno turno = new Turno();
		turno = converter.requestToTurno(turnoRequest);
		turnoResponse = converter.turnoToResponse(turnoRepository.save(turno));
		turnoResponse.setCodRespuesta(1);
		turnoResponse.setMensaje("Turno creado");
		return turnoResponse;
	}

}
