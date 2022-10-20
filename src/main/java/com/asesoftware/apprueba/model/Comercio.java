package com.asesoftware.apprueba.model;

import javax.persistence.*;

@Entity
public class Comercio {

	@Id
	private Integer idComercio;
	
	@Column
	private String nomComercio;
	
	@Column
	private Integer aforoMaximo;

	public String getNomComercio() {
		return this.nomComercio;
	}

	public void setNomComercio(String nomComercio) {
		this.nomComercio = nomComercio;
	}
	
	public Integer getAforoMaximo() {
		return this.aforoMaximo;
	}

	public void setAforoMaximo(Integer aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}
	
}
