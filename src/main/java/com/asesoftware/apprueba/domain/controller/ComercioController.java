package com.asesoftware.apprueba.domain.controller;

import com.asesoftware.apprueba.model.*;
import com.asesoftware.apprueba.domain.proxy.IComercioService;
import com.asesoftware.apprueba.domain.service.ComercioServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ComercioController {

	@Autowired
	ComercioServiceProxy comercioProxy;
	
	@GetMapping("/comercio/obtenerById")
    public ComercioResponse obtenerComercioPorId(@Valid @RequestParam Integer id){
        IComercioService comercioService = comercioProxy;
       return comercioService.findByIdComercio(id);
    }

}
