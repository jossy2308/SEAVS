package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.RolesPermisos;

public interface RolPermisoServicio {
	
	public void ingresarRolPermiso (RolesPermisos nuevoRolPermiso);
	
	public List<RolesPermisos> listarRolPermiso();

}
