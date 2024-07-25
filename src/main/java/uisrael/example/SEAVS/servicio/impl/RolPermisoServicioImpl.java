package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.RolesPermisos;
import uisrael.example.SEAVS.repository.RolesPermisoRepositorio;
import uisrael.example.SEAVS.servicio.RolPermisoServicio;

@Service
@Component

public class RolPermisoServicioImpl implements RolPermisoServicio {

	@Autowired
	private RolesPermisoRepositorio repRolesPermiso;
	@Override
	public void ingresarRolPermiso(RolesPermisos nuevoRolPermiso) {
	try {
		repRolesPermiso.save(nuevoRolPermiso);
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}

	@Override
	public List<RolesPermisos> listarRolPermiso() {
		
		return repRolesPermiso.findAll();
	}

}
