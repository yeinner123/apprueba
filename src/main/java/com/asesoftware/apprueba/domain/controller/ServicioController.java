package com.asesoftware.apprueba.domain.controller;

import com.asesoftware.apprueba.model.*;
import com.asesoftware.apprueba.domain.proxy.IServicioService;
import com.asesoftware.apprueba.domain.service.ServicioServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ServicioController {

	@Autowired
	ServicioServiceProxy servicioProxy;
	
	@GetMapping("/servicio/obtenerById")
    public ServicioResponse obtenerServicioPorId(@Valid @RequestParam Integer id){
        IServicioService servicioService = servicioProxy;
       return servicioService.findByIdServicio(id);
    }
	
}
