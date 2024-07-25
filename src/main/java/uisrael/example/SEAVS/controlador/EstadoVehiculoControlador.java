package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.EstadoVehiculo;
import uisrael.example.SEAVS.servicio.EstadoVehiculoServicio;
import uisrael.example.SEAVS.servicio.VehiculoServicio;

@Controller
public class EstadoVehiculoControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private EstadoVehiculoServicio servicioEstadoVehiculo;
	@Autowired
	private VehiculoServicio serviciVehiculo;
	 
	@GetMapping("/estadoVehiculo")
	public String listarEstadoVehiculo(Model model) {
		model.addAttribute("estadosVehiculos", servicioEstadoVehiculo.listarEstVeh());
		return "listarEstadoVehiculo";
	}

	@GetMapping("/nuevoEstadoVehiculo")
	public String crearEstadoVehiculo(Model model) {
		EstadoVehiculo nuevoEstadoVehiculo = new EstadoVehiculo();
		model.addAttribute("nuevo", nuevoEstadoVehiculo);
		model.addAttribute("vehiculos", serviciVehiculo.listarVehiculos());
		return "nuevoEstadoVehiculo";
	}
	
	@PostMapping("/guardarEstadoVehiculo")
	public String guardarEstadoVehiculo(@ModelAttribute("nuevoEstadoVehiculo") EstadoVehiculo nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioEstadoVehiculo.ingresarEstVeh(nuevoHtml);
		return "redirect:/estadoVehiculo";
	}
}

