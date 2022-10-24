package com.asesoftware.apprueba.entity;

import lombok.Data;

@Data
public class TurnoRequest {
	private String fechaTurno;
	private String horaInicio;
	private String horaFin;
	private String estado;
	private Servicio servicio;
	
	public String getFechaTurno() {
		return fechaTurno;
	}
	
	public void setFechaTurno(String fechaTurno) {
		this.fechaTurno = fechaTurno;
	}
	
	public String getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public String getHoraFin() {
		return horaFin;
	}
	
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Servicio getServicio() {
		return servicio;
	}
	
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
}
