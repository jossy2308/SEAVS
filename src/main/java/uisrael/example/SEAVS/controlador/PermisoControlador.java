package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.Permisos;
import uisrael.example.SEAVS.servicio.PermisoServicio;

@Controller
public class PermisoControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private PermisoServicio servicioPermiso;
	 
	@GetMapping("/permiso")
	public String listarPermiso(Model model) {
		model.addAttribute("permisos", servicioPermiso.listarPermisos());
		return "listarPermiso";
	}

	@GetMapping("/nuevoPermiso")
	public String crearPermiso(Model model) {
		Permisos nuevoPermiso = new Permisos();
		model.addAttribute("nuevo", nuevoPermiso);
		return "nuevoPermiso";
	}
	
	@PostMapping("/guardarPermiso")
	public String guardarPermiso(@ModelAttribute("nuevoPermiso") Permisos nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioPermiso.ingresarPermiso(nuevoHtml);
		return "redirect:/permiso";
	}

}
