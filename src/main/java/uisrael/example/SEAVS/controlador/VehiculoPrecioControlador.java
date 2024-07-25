package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import uisrael.example.SEAVS.entidades.VehiculosPrecios;
import uisrael.example.SEAVS.servicio.VehiculoPrecioServicio;
import uisrael.example.SEAVS.servicio.VehiculoServicio;

@Controller
public class VehiculoPrecioControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private VehiculoPrecioServicio servicioVehiculoPrecio;
	@Autowired
	private VehiculoServicio servicioVehiculo;
	 
	@GetMapping("/vehiculoPrecio")
	public String listarVehiculoPrecio(Model model) {
		model.addAttribute("vehiculosPrecios", servicioVehiculoPrecio.listarVehPrecios());
		return "listarVehiculoPrecio";
	}

	@GetMapping("/nuevoVehiculoPrecio")
	public String crearVehiculoPrecio(Model model) {
		VehiculosPrecios nuevoVehiculoPrecio = new VehiculosPrecios();
		model.addAttribute("nuevo", nuevoVehiculoPrecio);
		model.addAttribute("vehiculos", servicioVehiculo.listarVehiculos());
		return "nuevoVehiculoPrecio";
	}
	
	@PostMapping("/guardarVehiculoPrecio")
	public String guardarVehiculoPrecio(@ModelAttribute("nuevoVehiculoPrecio") VehiculosPrecios nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioVehiculoPrecio.ingresarVehPrecio(nuevoHtml);
		return "redirect:/vehiculoPrecio";
	}
	
	
}
