package com.asesoftware.apprueba.model;

import javax.persistence.*;

@Entity
public class Turno {

	@Id
	private Integer idTurno;
	
	@Column
	private Integer idServicio;
	
	@Column
	private String fechaTurno;
	
	@Column
	private String horaInicio;
	
	@Column
	private String horaFin;
	
	@Column
	private String estado;

	public String getFechaTurno() {
		return this.fechaTurno;
	}

	public void setFechaTurno(String fechaTurno) {
		this.fechaTurno = fechaTurno;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
