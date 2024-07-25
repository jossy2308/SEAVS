package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.Roles;
import uisrael.example.SEAVS.servicio.RolServicio;

@Controller
public class RolControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private RolServicio servicioRol;
	 
	@GetMapping("/rol")
	public String listarRol(Model model) {
		model.addAttribute("roles", servicioRol.listarRoles());
		return "listarRol";
	}

	@GetMapping("/nuevoRol")
	public String crearRol(Model model) {
		Roles nuevoRol = new Roles();
		model.addAttribute("nuevo", nuevoRol);
		return "nuevoRol";
	}
	
	@PostMapping("/guardarRol")
	public String guardarRol(@ModelAttribute("nuevoRol") Roles nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioRol.ingresarRol(nuevoHtml);
		return "redirect:/rol";
	}
}

