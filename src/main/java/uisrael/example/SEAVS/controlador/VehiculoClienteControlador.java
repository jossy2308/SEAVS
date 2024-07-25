package uisrael.example.SEAVS.controlador;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.VehiculoClientes;
import uisrael.example.SEAVS.servicio.ClientesServicio;
import uisrael.example.SEAVS.servicio.VehiculoClienteServicio;
import uisrael.example.SEAVS.servicio.VehiculoServicio;

@Controller
public class VehiculoClienteControlador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private VehiculoClienteServicio servicioVehiculoCliente;
	@Autowired
	private ClientesServicio servicioCliente;
	@Autowired
	private VehiculoServicio servicioVehiculo;
	 
	@GetMapping("/vehiculoCliente")
	public String listarVehiculoCliente(Model model) {
		model.addAttribute("vehiculosClientes", servicioVehiculoCliente.listarVehCliente());
		return "listarVehiculoCliente";
	}

	@GetMapping("/nuevoVehiculoCliente")
	public String crearVehiculoCliente(Model model) {
		VehiculoClientes nuevoVehiculoCliente = new VehiculoClientes();
		model.addAttribute("nuevo", nuevoVehiculoCliente);
		model.addAttribute("vehiculos", servicioVehiculo.listarVehiculos());
		model.addAttribute("clientes", servicioCliente.listarClientes());
		return "nuevoVehiculoCliente";
	}
	
	@PostMapping("/guardarVehiculoCliente")
	public String guardarVehiculoCliente(@ModelAttribute("nuevoVehiculoCliente") VehiculoClientes nuevoHtml) {
		servicioVehiculoCliente.ingresarVehiculoCliente(nuevoHtml);
		return "redirect:/vehiculoCliente";
	}

}
