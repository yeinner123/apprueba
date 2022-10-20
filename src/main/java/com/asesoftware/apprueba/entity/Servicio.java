package com.asesoftware.apprueba.entity;

import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Servicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idServicio;
	@Column
	private String nomServicio;
	@Column
	private String horaApertura;
	@Column
	private String horaCierre;
	@Column
	private Integer duracion;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "idComercio")
	private Comercio comercio;
	
	@OneToMany(mappedBy = "servicio", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Turno> turnos;

	public Servicio() {
		super();
	}

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

	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", nomServicio=" + nomServicio + ", horaApertura=" + horaApertura 
				+ ", horaCierre=" + horaCierre + ", duracion=" + duracion + ", comercio=" + comercio + "]";
	}
	
}
