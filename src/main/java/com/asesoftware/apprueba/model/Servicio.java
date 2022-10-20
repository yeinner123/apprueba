package com.asesoftware.apprueba.model;

import javax.persistence.*;

@Entity
public class Servicio {

	@Id
	private Integer idServicio;
	
	@Column
	private Integer idComercio;
	
	@Column
	private String nomServicio;
	
	@Column
	private String horaApertura;
	
	@Column
	private String horaCierre;
	
	@Column
	private Integer duracion;

	public String getNomServicio() {
		return this.nomServicio;
	}

	public void setNomServicio(String nomServicio) {
		this.nomServicio = nomServicio;
	}

	public String getHoraApertura() {
		return this.horaApertura;
	}

	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}

	public String getHoraCierre() {
		return this.horaCierre;
	}

	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

	public Integer getDuracion() {
		return this.duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}	
	
}
