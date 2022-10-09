package com.asesoftware.apprueba.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ComercioResponse {

    private int codRespuesta;
    private String mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Comercio comercio;
	
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
	
	public Comercio getComercio() {
		return this.comercio;
	}
	
	public void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}
    
}