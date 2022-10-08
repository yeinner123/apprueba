package com.asesoftware.apprueba.converter;

import com.asesoftware.apprueba.model.Comercio;
import com.asesoftware.apprueba.model.ComercioResponse;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercioConverter {

	public ComercioResponse comercioToResponse(Comercio comercio) {
		ComercioResponse response = new ComercioResponse();
		response.setComercio(comercio);
		return response;
	}
	
}
