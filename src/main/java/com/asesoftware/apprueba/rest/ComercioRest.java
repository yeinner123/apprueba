package com.asesoftware.apprueba.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.apprueba.dao.ComercioDao;

@RestController
@RequestMapping("comercio")
public class ComercioRest {
	//localhost:8080/apprueba
	@Autowired
	private ComercioDao comercioDao;
	
	//Metodos HTTP - solicitud al servidor
	//GET -> 200
	
}
