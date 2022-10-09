package com.asesoftware.apprueba.domain.proxy;

import com.asesoftware.apprueba.model.ServicioResponse;

public interface IServicioService {

	public ServicioResponse findByIdServicio(Integer id);
	
}
