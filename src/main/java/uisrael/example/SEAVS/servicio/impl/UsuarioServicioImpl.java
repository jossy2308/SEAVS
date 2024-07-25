package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.Usuario;
import uisrael.example.SEAVS.repository.UsuarioRepositorio;
import uisrael.example.SEAVS.servicio.UsuarioServicio;

@Service
@Component

public class UsuarioServicioImpl implements UsuarioServicio{

	@Autowired
	private UsuarioRepositorio repUsuario;
	@Override
	public void ingresarUsuario(Usuario nuevoUsuario) {
		try {
			repUsuario.save(nuevoUsuario);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Usuario> listarUsuario() {
	
		return repUsuario.findAll();
	}

	@Override
	public Usuario autenticar(String email, String contraseña) {
		return repUsuario.findByEmailAndContraseña(email, contraseña);
	}

}
