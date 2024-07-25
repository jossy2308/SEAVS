package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uisrael.example.SEAVS.entidades.Usuario;
import uisrael.example.SEAVS.servicio.RolServicio;
import uisrael.example.SEAVS.servicio.UsuarioServicio;

@Controller
public class UsuarioControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private UsuarioServicio servicioUsuario;
	@Autowired
	private RolServicio sevRol;
	 
	@GetMapping("/usuario")
	public String listarUsuario(Model model) {
		model.addAttribute("usuarios", servicioUsuario.listarUsuario());
		return "listarUsuario";
	}

	@GetMapping("/nuevoUsuario")
	public String crearUsuario(Model model) {
		Usuario nuevoUsuario = new Usuario();
		model.addAttribute("nuevo", nuevoUsuario);
		model.addAttribute("roles", sevRol.listarRoles());
		return "nuevoUsuario";
	}
	
	@PostMapping("/guardarUsuario")
	public String guardarUsuario(@ModelAttribute("nuevoUsuario") Usuario nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioUsuario.ingresarUsuario(nuevoHtml);
		return "redirect:/usuario";
	}
	
	//  autenticación
	@PostMapping("/login")
    public String login(@RequestParam("email") String email, 
                        @RequestParam("password") String contraseña, 
                        Model model) {
        Usuario usuario = servicioUsuario.autenticar(email, contraseña);
        if (usuario != null) {
            return "redirect:/plantillaPrincipal";
        } else {
            model.addAttribute("error", "Credenciales incorrectas, vuelva a intentarlo");
            return "login";
        }
    }
}


