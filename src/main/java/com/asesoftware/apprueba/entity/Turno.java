package com.asesoftware.apprueba.entity;

import javax.persistence.*;

@Entity
@Table(name = "turno")
public class Turno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurno;
	@Column(name = "fecha_turno")
	private String fechaTurno;
	@Column(name = "hora_inicio")
	private String horaInicio;
	@Column(name = "hora_fin")
	private String horaFin;
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne(cascade = {CascadeType.REFRESH})
	@JoinColumn(name = "idServicio")
	private Servicio servicio;
	
	public Turno() {
	}

	public Turno(String fechaTurno, String horaInicio, String horaFin, String estado) {
		this.fechaTurno = fechaTurno;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.estado = estado;
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
	
	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", fechaTurno=" + fechaTurno + ", horaInicio=" + horaInicio 
				+ ", horaFin=" + horaFin + ", estado=" + estado + "]";
	}
		
}
