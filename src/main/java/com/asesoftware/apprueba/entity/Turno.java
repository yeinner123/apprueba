package com.asesoftware.apprueba.entity;

import javax.persistence.*;

@Entity
@Table(name = "turno")
public class Turno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurno;
	@Column
	private String fechaTurno;
	@Column
	private String horaInicio;
	@Column
	private String horaFin;
	@Column
	private String estado;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "idServicio")
	private Servicio servicio;

	public Turno() {
		super();
	}

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

	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", fechaTurno=" + fechaTurno + ", horaInicio=" + horaInicio 
				+ ", horaFin=" + horaFin + ", estado=" + estado + ", servicio=" + servicio + "]";
	}
	
	
	
}
