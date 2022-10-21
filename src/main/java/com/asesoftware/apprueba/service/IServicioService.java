package com.asesoftware.apprueba.service;

import java.util.List;
import java.util.Optional;
import com.asesoftware.apprueba.entity.Servicio;

public interface IServicioService {
	public abstract List<Servicio> findAllServicio();
	public abstract Optional<Servicio> findByIdServicio(Integer idServicio);
}
