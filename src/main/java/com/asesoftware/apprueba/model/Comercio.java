package com.asesoftware.apprueba.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "COMERCIOS")
@JsonIdentityInfo(generator= ObjectIdGenerators.UUIDGenerator.class, property="@id")
public class Comercio implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComercio;
    private String nomComercio;
    private String aforoMaximo;
	
    @JsonManagedReference(value = "Comercios_Servicios")
    @OneToMany(mappedBy = "Comercio")
    private List<Servicio> servicio;

	@Override
	public String toString() {
		return "Comercio [idComercio=" + idComercio + ", nomComercio=" + nomComercio
				+ ", aforoMaximo=" + aforoMaximo + "]";
	}
    
}