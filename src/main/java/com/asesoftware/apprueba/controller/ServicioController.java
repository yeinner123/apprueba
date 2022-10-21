package com.asesoftware.apprueba.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.apprueba.entity.Servicio;
import com.asesoftware.apprueba.service.ServicioService;

@RestController
@RequestMapping("/servicio")
@CrossOrigin(origins = "*")
public class ServicioController {
	@Autowired
	@Qualifier("servicioService")
	private ServicioService servicioService;
	
	@GetMapping(path = "/findAllServicio", produces = {"application/json"})
	public List<Servicio> findAllServicio() {
		return servicioService.findAllServicio();
	}
	
	@GetMapping(path = "/findByIdServicio", produces = {"application/json"})
	public Optional<Servicio> findByIdServicio(@Valid @RequestParam Integer idServicio) {
		return servicioService.findByIdServicio(idServicio);
	}
}
