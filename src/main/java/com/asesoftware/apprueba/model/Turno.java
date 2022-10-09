package com.asesoftware.apprueba.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.Value;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "TURNO")
@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="id")
public class Turno implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurno;
    @NotNull
    private int idServicio;
    @NotNull
    private String fechaTurno;
    @NotNull
    private String horaInicio;
    @NotNull
    private String horaFin;
    @NotNull
    private String estado;
    
    @JsonBackReference(value = "Servicios_Turnos")
    @ManyToOne
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO")
    private Servicio servicio;

	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", idServicio=" + idServicio + ", fechaTurno=" + fechaTurno
				+ ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", estado=" + estado + ", servicio="
				+ servicio + "]";
	}
    
}