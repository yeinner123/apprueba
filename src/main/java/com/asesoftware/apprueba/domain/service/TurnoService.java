package com.asesoftware.apprueba.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asesoftware.apprueba.domain.proxy.ITurnoService;
import com.asesoftware.apprueba.model.Turno;
import com.asesoftware.apprueba.model.TurnoResponse;
import com.asesoftware.apprueba.repository.ITurno;
import static com.asesoftware.apprueba.tools.Constants.*;

@Service
public class TurnoService implements ITurnoService {
	
	@Autowired
	ITurno turnoRepo;
	
	@Override
    public TurnoResponse findByIdTurno(Integer id) {
		TurnoResponse response = new TurnoResponse();
        Turno turno = new Turno();
        turno = turnoRepo.findByIdTurno(id);
        if(turno == null){
            response.setCodRespuesta(ServiceResponseError);
            response.setMensaje("Comercio No Encontrado");
        }else{
            response.setCodRespuesta(ServiceResponse);
            response.setMensaje("Comercio Encontrado");
            response.setTurno(turno);
        }
        return response;
    }
}