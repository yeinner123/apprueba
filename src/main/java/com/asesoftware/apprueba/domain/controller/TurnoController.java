package com.asesoftware.apprueba.domain.controller;

import com.asesoftware.apprueba.model.*;
import com.asesoftware.apprueba.domain.proxy.ITurnoService;
import com.asesoftware.apprueba.domain.service.TurnoServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TurnoController {

	@Autowired
	TurnoServiceProxy turnoProxy;
	
	@GetMapping("/turno/obtenerById")
    public TurnoResponse obtenerTurnoPorId(@Valid @RequestParam Integer id){
        ITurnoService turnoService = turnoProxy;
       return turnoService.findByIdTurno(id);
    }
	
}