package com.asesoftware.apprueba.domain.proxy;

import com.asesoftware.apprueba.model.TurnoResponse;

public interface ITurnoService {
	
	public TurnoResponse findByIdTurno(Integer id);
	
}