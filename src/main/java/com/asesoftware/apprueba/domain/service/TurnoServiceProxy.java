package com.asesoftware.apprueba.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asesoftware.apprueba.domain.proxy.ITurnoService;
import com.asesoftware.apprueba.model.TurnoResponse;

@Service
public class TurnoServiceProxy implements ITurnoService{

	@Autowired
	TurnoService turnoService;
	
	@Override
    public TurnoResponse findByIdTurno(Integer id) {
        getInstanceAnalize(turnoService);
        return turnoService.findByIdTurno(id);
    }

	private TurnoService getInstanceAnalize(TurnoService turnoService){
        if (turnoService == null){
        	turnoService = new TurnoService();
        }
        return turnoService;
    }
	
}