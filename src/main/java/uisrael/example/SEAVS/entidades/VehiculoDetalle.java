package uisrael.example.SEAVS.entidades;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table (name = "tb_vehiculoDetalle")

public class VehiculoDetalle implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVehDetalle;
	private boolean estado;
	private double valor;
	
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@ManyToOne
	@JoinColumn(name = "fkVehiculo")
	private Vehiculo fkVehiculo;
	
	@ManyToOne
	@JoinColumn (name = "fkDetalle")
	private Detalle fkDetalle;
	

}
