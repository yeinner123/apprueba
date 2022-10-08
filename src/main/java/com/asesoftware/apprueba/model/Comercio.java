package com.asesoftware.apprueba.model;

import javax.validation.constraints.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Comercio", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_comercio"})})
public class Comercio implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComercio;
    @NotNull
    private String nomComercio;
    @NotNull
    private String aforoMaximo;
	
    @Override
	public String toString() {
		return "Comercio [idComercio=" + idComercio + ", nomComercio=" + nomComercio + ", aforoMaximo=" + aforoMaximo + "]";
	}
    
}

