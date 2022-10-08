package com.asesoftware.apprueba.domain.service;

import com.asesoftware.apprueba.model.ComercioResponse;
import com.asesoftware.apprueba.domain.proxy.IComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComercioServiceProxy implements IComercioService{

	@Autowired
	ComercioService comercioService;
	
	@Override
    public ComercioResponse findByIdComercio(Integer id) {
        getInstanceAnalize(comercioService);
        return comercioService.findByIdComercio(id);
    }

	private ComercioService getInstanceAnalize(ComercioService comercioService){
        if (comercioService == null){
        	comercioService = new ComercioService();
        }
        return comercioService;
    }
}
