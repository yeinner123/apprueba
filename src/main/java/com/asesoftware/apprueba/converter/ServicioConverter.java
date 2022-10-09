package com.asesoftware.apprueba.converter;

import com.asesoftware.apprueba.model.Servicio;
import com.asesoftware.apprueba.model.ServicioResponse;
import org.springframework.stereotype.Component;

@Component
public class ServicioConverter {

	public ServicioResponse servicioToResponse(Servicio servicio) {
		ServicioResponse response = new ServicioResponse();
		response.setServicio(servicio);
		return response;
	}
	
}