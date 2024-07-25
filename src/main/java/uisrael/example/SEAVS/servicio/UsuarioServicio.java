package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.Usuario;

public interface UsuarioServicio {
	
	public void ingresarUsuario (Usuario nuevoUsuario);
	
	public List<Usuario> listarUsuario();
	 
	public Usuario autenticar(String email, String contraseña);


}
