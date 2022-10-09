package com.asesoftware.apprueba.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class TurnoResponse {

	private int codRespuesta;
    private String mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Turno turno;
	
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
	
	public Turno getTurno() {
		return this.turno;
	}
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
   
}