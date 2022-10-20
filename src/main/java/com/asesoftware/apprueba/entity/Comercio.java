package com.asesoftware.apprueba.entity;

import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Comercio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idComercio;
	@Column
	private String nomComercio;
	@Column
	private Integer aforoMaximo;
	
	@OneToMany(mappedBy = "comercio", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Servicio> servicios;

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
