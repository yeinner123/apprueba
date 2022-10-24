package com.asesoftware.apprueba.converter;

import org.springframework.stereotype.Component;
import com.asesoftware.apprueba.entity.Turno;
import com.asesoftware.apprueba.entity.TurnoRequest;
import com.asesoftware.apprueba.entity.TurnoResponse;

@Component
public class TurnoConverter {
	
	public Turno requestToTurno(TurnoRequest request){
		Turno turno = new Turno();
		turno.setFechaTurno(request.getFechaTurno());
		turno.setHoraInicio(request.getHoraInicio());
		turno.setHoraFin(request.getHoraFin());
		turno.setEstado(request.getEstado());
		turno.setServicio(request.getServicio());
		return turno;
	}
	    
	public TurnoResponse turnoToResponse(Turno turno){
	    TurnoResponse response = new TurnoResponse();
	    response.setTurno(turno);
	    return response;
	}
}
