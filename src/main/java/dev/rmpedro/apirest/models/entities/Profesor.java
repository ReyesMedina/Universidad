package dev.rmpedro.apirest.models.entities;

import java.math.BigDecimal;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
//@Table(name = "profesores")
@Table(name = "profesores", schema = "universidad")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Profesor extends Persona{
	

    @Positive(message = "No puede ser menor que 0")
	private BigDecimal sueldo;
    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "profesor_carrera",schema = "universidad",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "carera_id")
    )
    @JsonIgnoreProperties({"hibernateLazyInitializer","profesores"})
	private Set<Carrera> carreras;
	

	
	private static final long serialVersionUID = -1049211861152774900L;

	public Profesor(Integer id, String nombre, String apellido, String dni, Direccion direccion,BigDecimal sueldo) {
		super(id, nombre, apellido, dni, direccion);
		this.sueldo=sueldo;
	}



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }


}
