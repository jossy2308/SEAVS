package uisrael.example.SEAVS.entidades;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "tb_VehiculosClientes")

public class VehiculoClientes implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVehiculoCliente;
	
	@ManyToOne
	@JoinColumn(name = "fkCliente")
	private Clientes fkCliente;
	
	@ManyToOne
	@JoinColumn(name = "fkVehiculo")
	private Vehiculo fkVehiculo;
	
}


