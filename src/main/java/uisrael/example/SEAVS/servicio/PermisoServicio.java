package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.Permisos;

public interface PermisoServicio {
	
	public void ingresarPermiso (Permisos nuevoPermiso);
	
	public List<Permisos> listarPermisos();

}
