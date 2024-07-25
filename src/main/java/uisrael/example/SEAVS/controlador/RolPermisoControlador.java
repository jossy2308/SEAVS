package uisrael.example.SEAVS.controlador;

import java.io.Serializable;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.RolesPermisos;
import uisrael.example.SEAVS.servicio.PermisoServicio;
import uisrael.example.SEAVS.servicio.RolPermisoServicio;
import uisrael.example.SEAVS.servicio.RolServicio;

@Controller
public class RolPermisoControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private RolPermisoServicio servicioRolPermiso;
	@Autowired
	private RolServicio servRol;
	@Autowired
	private PermisoServicio serPer;
	 
	@GetMapping("/rolPermiso")
	public String listarRolPermiso(Model model) {
		model.addAttribute("rolesPermisos", servicioRolPermiso.listarRolPermiso());
		return "listarRolPermiso";
	}

	@GetMapping("/nuevoRolPermiso")
	public String crearRolPermiso(Model model) {
		RolesPermisos nuevoRolPermiso = new RolesPermisos();
		model.addAttribute("nuevo", nuevoRolPermiso);
		model.addAttribute("roles", servRol.listarRoles());
		model.addAttribute("permisos", serPer.listarPermisos());
		return "nuevoRolPermiso";
	}
	
	@PostMapping("/guardarRolPermiso")
	public String guardarRolPermiso(@ModelAttribute("nuevoRolPermiso") RolesPermisos nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioRolPermiso.ingresarRolPermiso(nuevoHtml);
		return "redirect:/rolPermiso";
	}
}

