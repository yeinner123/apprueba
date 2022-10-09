package com.asesoftware.apprueba.domain.service;

import com.asesoftware.apprueba.model.Comercio;
import com.asesoftware.apprueba.model.ComercioResponse;
import com.asesoftware.apprueba.repository.IComercio;
import com.asesoftware.apprueba.domain.proxy.IComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.asesoftware.apprueba.tools.Constants.*;

@Service
public class ComercioService implements IComercioService{

	@Autowired
	IComercio comercioRepo;
	
	@Override
    public ComercioResponse findByIdComercio(Integer id) {
		ComercioResponse response = new ComercioResponse();
        Comercio comercio = new Comercio();
        comercio = comercioRepo.findByidComercio(id);
        if(comercio == null){
            response.setCodRespuesta(ServiceResponseError);
            response.setMensaje("Comercio No Encontrado");
        }else{
            response.setCodRespuesta(ServiceResponse);
            response.setMensaje("Comercio Encontrado");
            response.setComercio(comercio);
        }
        return response;
    }
}
