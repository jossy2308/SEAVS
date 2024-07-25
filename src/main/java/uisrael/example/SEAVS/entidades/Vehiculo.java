package uisrael.example.SEAVS.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table (name = "tb_vehiculo")

public class Vehiculo implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVehiculo;
	private String placa;
	private String color;
	private String marca;
	private String modelo;
	private int anio;
	private double kilometraje; 
	
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@OneToMany(mappedBy = "fkVehiculo")
	private List<VehiculoClientes> listaVehclientes = new ArrayList<>();
	
	@OneToMany(mappedBy = "fkVehiculo")
	private List<VehiculosPrecios> listaVehprecios = new ArrayList<>();
	
	@OneToMany(mappedBy = "fkVehiculo")
	private List<VehiculoDetalle> listaVehdetalles = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn (name = "fkUsuario")
	private Usuario fkUsuario;
	
	@ManyToOne
	@JoinColumn (name = "fkEstadoVehiculo")
	private EstadoVehiculo fkEstadoVehiculo;
	

}
