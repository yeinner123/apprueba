package com.asesoftware.apprueba.converter;

import org.springframework.stereotype.Component;
import com.asesoftware.apprueba.model.Turno;
import com.asesoftware.apprueba.model.TurnoResponse;

@Component
public class TurnoConverter {

	public TurnoResponse turnoToResponse(Turno turno) {
		TurnoResponse response = new TurnoResponse();
		response.setTurno(turno);
		return response;
	}
	
}