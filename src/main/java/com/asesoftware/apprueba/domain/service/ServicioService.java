package com.asesoftware.apprueba.domain.service;

import com.asesoftware.apprueba.model.Servicio;
import com.asesoftware.apprueba.model.ServicioResponse;
import com.asesoftware.apprueba.repository.IServicio;
import com.asesoftware.apprueba.domain.proxy.IServicioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.asesoftware.apprueba.tools.Constants.*;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	IServicio servicioRepo;
	
	@Override
    public ServicioResponse findByIdServicio(Integer id) {
		ServicioResponse response = new ServicioResponse();
        Servicio servicio = new Servicio();
        servicio = servicioRepo.findByidServicio(id);
        if(servicio == null){
            response.setCodRespuesta(ServiceResponseError);
            response.setMensaje("Comercio No Encontrado");
        }else{
            response.setCodRespuesta(ServiceResponse);
            response.setMensaje("Comercio Encontrado");
            response.setServicio(servicio);
        }
        return response;
    }
}