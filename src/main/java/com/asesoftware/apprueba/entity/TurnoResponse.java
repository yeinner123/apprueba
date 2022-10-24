package com.asesoftware.apprueba.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class TurnoResponse {
	private int codRespuesta;
    private String mensaje;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Turno turno;
    
	public int getCodRespuesta() {
		return codRespuesta;
	}
	
	public void setCodRespuesta(int codRespuesta) {
		this.codRespuesta = codRespuesta;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public Turno getTurno() {
		return turno;
	}
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
    
}
