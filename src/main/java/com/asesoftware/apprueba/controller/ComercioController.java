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
import com.asesoftware.apprueba.entity.Comercio;
import com.asesoftware.apprueba.service.ComercioService;

@RestController
@RequestMapping("/comercio")
@CrossOrigin(origins = "*")
public class ComercioController {
	@Autowired
	@Qualifier("comercioService")
	private ComercioService comercioService;
	
	@GetMapping(path = "/findAllComercio", produces = {"application/json"})
	public List<Comercio> findAllComercio() {
		return comercioService.findAllComercio();
	}
	
	@GetMapping(path = "/findByIdComercio", produces = {"application/json"})
	public Optional<Comercio> findByIdComercio(@RequestParam Integer idComercio) {
		return comercioService.findByIdComercio(idComercio);
	}
}