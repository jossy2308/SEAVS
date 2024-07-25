package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.Detalle;
import uisrael.example.SEAVS.servicio.DetalleServicio;

@Controller
public class DetalleCotrolador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DetalleServicio servicioDetalle;

	@GetMapping("/detalle")
	public String listarDetalle(Model model) {
		model.addAttribute("detalles", servicioDetalle.listarDetalle());
		return "listarDetalle";
	}

	@GetMapping("/nuevoDetalle")
	public String crearDetalle(Model model) {
		Detalle nuevoDetalle = new Detalle();
		model.addAttribute("nuevo", nuevoDetalle);
		return "nuevoDetalle";
	}
	
	@PostMapping("/guardarDetalle")
	public String guardarDetalle(@ModelAttribute("nuevoDetalle") Detalle nuevoHtml) {
		nuevoHtml.setFechaRegistro(new Date());
		servicioDetalle.ingresarDetalle(nuevoHtml);
		return "redirect:/detalle";
	}
}


