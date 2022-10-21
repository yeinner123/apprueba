package com.asesoftware.apprueba.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.asesoftware.apprueba.entity.Servicio;
import com.asesoftware.apprueba.repository.ServicioRepository;

@Service("servicioService")
@Transactional
public class ServicioService implements IServicioService {

	@Autowired
	@Qualifier("servicioRepository")
	private ServicioRepository servicioRepository;
	
	@Override
	public List<Servicio> findAllServicio() {
		return (List<Servicio>) servicioRepository.findAll();
	}

	@Override
	public Optional<Servicio> findByIdServicio(Integer idServicio) {
		return servicioRepository.findById(idServicio);
	}

}
