package uisrael.example.SEAVS.controlador;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import uisrael.example.SEAVS.entidades.Clientes;
import uisrael.example.SEAVS.servicio.ClientesServicio;

@Controller
public class ClienteControlador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired 
	private ClientesServicio servicioCliente;
	 
	@GetMapping ("/cliente")
	public String listarCliente (Model model) {
		model.addAttribute("clientes", servicioCliente.listarClientes());
		return "listarCliente";
		
	}
	@GetMapping ("/nuevoCliente")
	public String crearCliente (Model model) {
		Clientes nuevoCliente = new Clientes();
		model.addAttribute("nuevo",  nuevoCliente);
		return "nuevoCliente";
	}
	
	@PostMapping("/guardarCliente")
	public String guardarCliente(@ModelAttribute("nuevoCliente") Clientes nuevoHtml) {
		
		nuevoHtml.setFechaRegistro(new Date());
		servicioCliente.ingresarCliente(nuevoHtml);
		return "redirect:/cliente";
	}
	

}

