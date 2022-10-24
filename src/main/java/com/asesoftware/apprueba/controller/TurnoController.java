package com.asesoftware.apprueba.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.apprueba.entity.Turno;
import com.asesoftware.apprueba.entity.TurnoRequest;
import com.asesoftware.apprueba.entity.TurnoResponse;
import com.asesoftware.apprueba.service.ServicioService;
import com.asesoftware.apprueba.service.TurnoServicio;

@RestController
@RequestMapping("/turno")
@CrossOrigin(origins = "*")
public class TurnoController {
	@Autowired
	@Qualifier("turnoService")
	private TurnoServicio turnoServicio;
	
	@Autowired
	@Qualifier("servicioService")
	private ServicioService servicioService;
	
	@GetMapping(path = "/findAllTurno", produces = {"application/json"})
	public List<Turno> findAllTurno() {
		return turnoServicio.findAllTurno();
	}
	
	@PostMapping(path = "/saveTurno", produces = {"application/json"})
	public TurnoResponse saveTurno(@RequestBody TurnoRequest turnoRequest) {
		return turnoServicio.saveTurno(turnoRequest);
	}
}
