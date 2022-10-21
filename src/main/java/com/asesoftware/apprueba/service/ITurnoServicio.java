package com.asesoftware.apprueba.service;

import java.util.List;
import com.asesoftware.apprueba.entity.Turno;

public interface ITurnoServicio {
	public abstract List<Turno> findAllTurno();
	public abstract Turno saveTurno(Turno turno);
}
