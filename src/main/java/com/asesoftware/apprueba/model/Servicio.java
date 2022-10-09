package com.asesoftware.apprueba.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "SERVICIOS", uniqueConstraints = {@UniqueConstraint(columnNames = {"ID_SERVICIOS"})})
@EntityListeners(AuditingEntityListener.class)
@JsonIdentityInfo(generator= ObjectIdGenerators.UUIDGenerator.class, property="@id")
public class Servicio implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    private int idComercio;
    private String nomServicio;
    private String horaApertura;
    private String horaCierre;
    private int duracion;
	
    @JsonBackReference(value = "Comercios_Servicios")
    @ManyToOne
    @JoinColumn(name = "ID_COMERCIO", referencedColumnName = "ID_COMERCIO")
    private Comercio comercio;

    @JsonManagedReference(value = "Servicios_Turnos")
    @OneToMany(mappedBy = "Turno")
    private List<Turno> turno;
    
	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", idComercio=" + idComercio + ", nomServicio=" + nomServicio
				+ ", horaApertura=" + horaApertura + ", horaCierre=" + horaCierre + ", duracion=" + duracion
				+ ", comercio=" + comercio + "]";
	}
    
}