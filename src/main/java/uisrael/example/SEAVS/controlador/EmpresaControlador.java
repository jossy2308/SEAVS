package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.Empresas;
import uisrael.example.SEAVS.servicio.EmpresaServicio;

@Controller
public class EmpresaControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired 
	private EmpresaServicio servicioEmpresa;
	 
	@GetMapping("/empresa")
	public String listarEmpresa(Model model) {
		model.addAttribute("empresas", servicioEmpresa.listarEmpresas());
		return "listarEmpresa";
	}

	@GetMapping("/nuevaEmpresa")
	public String crearEmpresa(Model model) {
		Empresas nuevaEmpresa = new Empresas();
		model.addAttribute("nueva", nuevaEmpresa);
		return "nuevaEmpresa";
	}
	
	@PostMapping("/guardarEmpresa")
	public String guardarEmpresa(@ModelAttribute("nuevaEmpresa") Empresas nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioEmpresa.ingresarEmpresa(nuevoHtml);
		return "redirect:/empresa";
	}
}

