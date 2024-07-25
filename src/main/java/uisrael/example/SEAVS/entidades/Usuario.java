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
@Table (name = "tb_usuario")

public class Usuario implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String usuario;
	private String email;
	private String contraseña;
	
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@OneToMany(mappedBy = "fkUsuario")
	private List<EmpresaUsuarios> listaEmpresaUs = new ArrayList<>();
	
	@OneToMany(mappedBy = "fkUsuario")
	private List<Vehiculo> listaVeh = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name ="fkRoles")
	private Roles fkRoles;
	
	

}
