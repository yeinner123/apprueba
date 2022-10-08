package com.asesoftware.apprueba.domain.controller;

import com.asesoftware.apprueba.domain.proxy.IComercioService;
import com.asesoftware.apprueba.domain.service.ComercioServiceProxy;
import com.asesoftware.apprueba.domain.service.ComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ComercioController {

	@Autowired
	ComercioServiceProxy comercioProxy;
}
