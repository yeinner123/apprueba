package com.asesoftware.apprueba.model;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Comercio", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_comercio"})})
@EntityListeners(AuditingEntityListener.class)
@JsonIdentityInfo(generator= ObjectIdGenerators.UUIDGenerator.class, property="@id")
public class Comercio implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComercio;
    @NotNull
    private String nomComercio;
    @NotNull
    private String aforoMaximo;
	
    /*
    @JsonBackReference(value = "uhas_Eva")
    @OneToMany(mappedBy = "usuarios")
    private List<Usuario_has_Evaluacion> usuario_has_Evaluacions;
    */
    
    @Override
	public String toString() {
		return "Comercio [idComercio=" + idComercio + ", nomComercio=" + nomComercio + ", aforoMaximo=" + aforoMaximo + "]";
	}
    
}

