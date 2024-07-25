package uisrael.example.SEAVS.controlador;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControlador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GetMapping("/login")
	public String verLogin() {
		return "login";
	}

}
