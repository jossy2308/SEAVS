package uisrael.example.SEAVS.controlador;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GetMapping("/plantillaPrincipal")
	public String verIndex() {
		return "plantillaPrincipal";
	}

}
