package com.asesoftware.apprueba.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.asesoftware.apprueba.entity.Comercio;
import com.asesoftware.apprueba.repository.ComercioRepository;

@Service("comercioService")
@Transactional
public class ComercioService implements IComercioService{

	@Autowired
	@Qualifier("comercioRepository")
	private ComercioRepository comercioRepository;
	
	@Override
	public List<Comercio> findAllComercio() {
		return (List<Comercio>) comercioRepository.findAll();
	}

	@Override
	public Optional<Comercio> findByIdComercio(Integer idComercio) {
		return comercioRepository.findById(idComercio);
	}

}
