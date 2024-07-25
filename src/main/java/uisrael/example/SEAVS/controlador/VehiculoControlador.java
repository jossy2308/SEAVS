package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uisrael.example.SEAVS.entidades.Vehiculo;
import uisrael.example.SEAVS.servicio.EstadoVehiculoServicio;
import uisrael.example.SEAVS.servicio.UsuarioServicio;
import uisrael.example.SEAVS.servicio.VehiculoServicio;

@Controller
public class VehiculoControlador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private VehiculoServicio servicioVehiculo;
	@Autowired
	private UsuarioServicio servicioUsuario;
	@Autowired
	private EstadoVehiculoServicio servEstVeh;
	 
	@GetMapping("/vehiculo")
	public String listarVehiculo(Model model) {
		model.addAttribute("vehiculos", servicioVehiculo.listarVehiculos());
		return "listarVehiculo";
	}

	@GetMapping("/nuevoVehiculo")
	public String crearVehiculo(Model model) {
		Vehiculo nuevoVehiculo = new Vehiculo();
		model.addAttribute("nuevo", nuevoVehiculo);
		model.addAttribute("usuarios", servicioUsuario.listarUsuario());
		model.addAttribute("estadoVehiculos", servEstVeh.listarEstVeh());
		return "nuevoVehiculo";
	}
	
	@PostMapping("/guardarVehiculo")
	public String guardarVehiculo(@ModelAttribute("nuevoVehiculo") Vehiculo nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioVehiculo.ingresarVehiculo(nuevoHtml);
		return "redirect:/vehiculo";
	}
	

	 @GetMapping("/vehiculo/{idVehiculo}")
	    @ResponseBody
	    public Vehiculo obtenerVehiculo(@PathVariable("idVehiculo") int idVehiculo) {
	        return servicioVehiculo.findById(idVehiculo);
	    }
}
