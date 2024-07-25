package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.Permisos;
import uisrael.example.SEAVS.repository.PermisosRepositorio;
import uisrael.example.SEAVS.servicio.PermisoServicio;

@Service
@Component

public class PermisoServicioImpl implements PermisoServicio{

	@Autowired
	private PermisosRepositorio repPermisos;
	@Override
	public void ingresarPermiso(Permisos nuevoPermiso) {
		try {
			repPermisos.save(nuevoPermiso);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Permisos> listarPermisos() {
	
		return repPermisos.findAll();
	}

}
