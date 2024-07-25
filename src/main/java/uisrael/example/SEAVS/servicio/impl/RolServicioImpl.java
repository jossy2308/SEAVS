package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.Roles;
import uisrael.example.SEAVS.repository.RolesRepositorio;
import uisrael.example.SEAVS.servicio.RolServicio;

@Service
@Component

public class RolServicioImpl implements RolServicio {

	@Autowired
	private RolesRepositorio repRoles;
	@Override
	public void ingresarRol(Roles nuevoRol) {
		try {
			repRoles.save(nuevoRol);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Roles> listarRoles() {
		return repRoles.findAll();
	}

}
