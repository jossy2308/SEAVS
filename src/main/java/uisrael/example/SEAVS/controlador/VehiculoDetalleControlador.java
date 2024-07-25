package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.VehiculoDetalle;
import uisrael.example.SEAVS.servicio.DetalleServicio;
import uisrael.example.SEAVS.servicio.VehiculoDetalleServicio;
import uisrael.example.SEAVS.servicio.VehiculoServicio;

@Controller
public class VehiculoDetalleControlador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private VehiculoDetalleServicio servicioVehiculoDetalle;
	@Autowired
	private VehiculoServicio servicioVeh;
	@Autowired
	private DetalleServicio servicioDetalle;
	 
	@GetMapping("/vehiculoDetalle")
	public String listarVehiculoDetalle(Model model) {
		model.addAttribute("vehiculosDetalles", servicioVehiculoDetalle.listarVehDetalle());
		return "listarVehiculoDetalle";
	}

	@GetMapping("/nuevoVehiculoDetalle")
	public String crearVehiculoDetalle(Model model) {
		VehiculoDetalle nuevoVehiculoDetalle = new VehiculoDetalle();
		model.addAttribute("nuevo", nuevoVehiculoDetalle);
		model.addAttribute("vehiculos", servicioVeh.listarVehiculos());
		model.addAttribute("detalles", servicioDetalle.listarDetallesActivos());
		return "nuevoVehiculoDetalle";
	}
	
	@PostMapping("/guardarVehiculoDetalle")
	public String guardarVehiculoDetalle(@ModelAttribute("nuevoVehiculoDetalle") VehiculoDetalle nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioVehiculoDetalle.ingresarVehiculoDetalle(nuevoHtml);
		return "redirect:/vehiculoDetalle";
	}
}
