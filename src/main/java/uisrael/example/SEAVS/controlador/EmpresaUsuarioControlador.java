package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.EmpresaUsuarios;
import uisrael.example.SEAVS.servicio.EmpresaServicio;
import uisrael.example.SEAVS.servicio.EmpresaUsuarioServicio;
import uisrael.example.SEAVS.servicio.UsuarioServicio;

@Controller
public class EmpresaUsuarioControlador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private EmpresaUsuarioServicio servicioEmpresaUsuario;
	
	@Autowired
	private EmpresaServicio servEmpresa;
	
	@Autowired
	private UsuarioServicio serUsuario;
	
	 
	@GetMapping("/empresaUsuario")
	public String listarEmpresaUsuario(Model model) {
		model.addAttribute("usuariosEmpresas", servicioEmpresaUsuario.listarUsuarioEmp());
		return "listarEmpresaUsuario";
	}

	@GetMapping("/nuevoEmpresaUsuario")
	public String crearEmpresaUsuario(Model model) {
		EmpresaUsuarios nuevoEmpresaUsuario = new EmpresaUsuarios();
		model.addAttribute("nuevo", nuevoEmpresaUsuario);
		model.addAttribute("empresas", servEmpresa.listarEmpresas());
		model.addAttribute("usuarios", serUsuario.listarUsuario());
		return "nuevoEmpresaUsuario";
	}
	
	@PostMapping("/guardarUsuarioEmpresa")
	public String guardarEmpresaUsuario(@ModelAttribute("nuevoUsuarioEmpresa") EmpresaUsuarios nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioEmpresaUsuario.ingresarUsuarioE(nuevoHtml);
		return "redirect:/empresaUsuario";
	}
}

