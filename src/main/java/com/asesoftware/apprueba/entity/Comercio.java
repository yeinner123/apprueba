package com.asesoftware.apprueba.entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "comercio")
public class Comercio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idComercio;
	@Column(name = "nom_comercio")
	private String nomComercio;
	@Column(name = "aforo_maximo")
	private Integer aforoMaximo;
	
	@OneToMany(mappedBy = "comercio", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Servicio> servicios;
	
	public Comercio() {
	}
	
	public Comercio(String nomComercio, Integer aforoMaximo, List<Servicio> servicios) {
		this.nomComercio = nomComercio;
		this.aforoMaximo = aforoMaximo;
	}
	
	public Integer getIdComercio() {
		return idComercio;
	}

	public String getNomComercio() {
		return this.nomComercio;
	}

	public Integer getAforoMaximo() {
		return this.aforoMaximo;
	}
	
	@Override
	public String toString() {
		return "Comercio [idComercio=" + idComercio + ", nomComercio=" + nomComercio + ", aforoMaximo=" + aforoMaximo + "]";
	}
	
}
