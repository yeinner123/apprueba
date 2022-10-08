package com.asesoftware.apprueba.domain.proxy;

import com.asesoftware.apprueba.model.ComercioResponse;

public interface IComercioService {

	public ComercioResponse findByIdComercio(Integer id);
	
}
