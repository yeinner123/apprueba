package com.asesoftware.apprueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.apprueba.entity.Comercio;
import com.asesoftware.apprueba.repository.ComercioRepository;

@Service
public class ComercioService {
	@Autowired
	private ComercioRepository iComercio;
	
	public List<Comercio> getAllComercios() {
		return iComercio.findAll();
	}
	
	public Optional<Comercio> getComercio(Integer idComercio) {
		return iComercio.findById(idComercio);
	}
}
