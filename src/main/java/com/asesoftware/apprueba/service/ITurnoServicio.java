package com.asesoftware.apprueba.service;

import java.util.List;
import com.asesoftware.apprueba.entity.Turno;
import com.asesoftware.apprueba.entity.TurnoRequest;
import com.asesoftware.apprueba.entity.TurnoResponse;

public interface ITurnoServicio {
	public abstract List<Turno> findAllTurno();
	public TurnoResponse saveTurno(TurnoRequest turnoRequest);
}
