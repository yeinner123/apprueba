package com.asesoftware.apprueba.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.apprueba.entity.Comercio;
import com.asesoftware.apprueba.repository.ComercioRepository;
import com.asesoftware.apprueba.service.ComercioService;

@RestController
@RequestMapping("comercio")
public class ComercioController {
	@Autowired
	private ComercioService comercioService;
	
	@GetMapping("/findAllComercio")
	public List<Comercio> getAllComercio() {
		return comercioService.getAllComercios();
	}
	
	@GetMapping("/findByIdComercio/{idComercio}")
	public Optional<Comercio> comercio(@Valid @RequestParam Integer idComercio) {
		return comercioService.getComercio(idComercio);
	}
}
