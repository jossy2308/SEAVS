package uisrael.example.SEAVS.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table (name = "tb_detalle")

public class Detalle implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle;
	private String nombre;
	private boolean estado; 		
		
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@OneToMany (mappedBy = "fkDetalle")
	private List<VehiculoDetalle> listaVehDetalle = new ArrayList<>();

}
