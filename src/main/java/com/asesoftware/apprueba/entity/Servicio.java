package com.asesoftware.apprueba.entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idServicio;
	@Column(name = "nom_servicio")
	private String nomServicio;
	@Column(name = "hora_apertura")
	private String horaApertura;
	@Column(name = "hora_cierre")
	private String horaCierre;
	@Column(name = "duracion")
	private Integer duracion;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "idComercio")
	private Comercio comercio;
	
	@OneToMany(mappedBy = "servicio", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Turno> turnos;

	public Servicio() {
	}

	public Servicio(Integer idServicio, String nomServicio, String horaApertura, String horaCierre, Integer duracion) {
		super();
		this.idServicio = idServicio;
		this.nomServicio = nomServicio;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.duracion = duracion;
	}

	public String getNomServicio() {
		return this.nomServicio;
	}

	public String getHoraApertura() {
		return this.horaApertura;
	}

	public String getHoraCierre() {
		return this.horaCierre;
	}

	public Integer getDuracion() {
		return this.duracion;
	}

	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", nomServicio=" + nomServicio + ", horaApertura=" + horaApertura 
				+ ", horaCierre=" + horaCierre + ", duracion=" + duracion + ", comercio=" + comercio + "]";
	}
	
}
