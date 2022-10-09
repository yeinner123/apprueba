package com.asesoftware.apprueba.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ServicioResponse {

    private int codRespuesta;
    private String mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Servicio servicio;
	
	public int getCodRespuesta() {
		return this.codRespuesta;
	}
	
	public void setCodRespuesta(int codRespuesta) {
		this.codRespuesta = codRespuesta;
	}
	
	public String getMensaje() {
		return this.mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public Servicio getServicio() {
		return this.servicio;
	}
	
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}