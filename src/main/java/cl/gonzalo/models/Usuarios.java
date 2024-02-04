package cl.gonzalo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class Usuarios {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String nombre;
	
	private String apellido;
	
	private String telefono;
	
	private String direccion;

	

	
	
	
	

}
