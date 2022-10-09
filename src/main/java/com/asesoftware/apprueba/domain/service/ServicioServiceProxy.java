package com.asesoftware.apprueba.domain.service;

import com.asesoftware.apprueba.model.ServicioResponse;
import com.asesoftware.apprueba.domain.proxy.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServiceProxy implements IServicioService{

	@Autowired
	ServicioService servicioService;
	
	@Override
    public ServicioResponse findByIdServicio(Integer id) {
        getInstanceAnalize(servicioService);
        return servicioService.findByIdServicio(id);
    }

	private ServicioService getInstanceAnalize(ServicioService servicioService){
        if (servicioService == null){
        	servicioService = new ServicioService();
        }
        return servicioService;
    }
}