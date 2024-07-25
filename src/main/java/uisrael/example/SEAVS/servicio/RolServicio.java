package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.Roles;

public interface RolServicio {
	
	public void ingresarRol (Roles nuevoRol);
	
	public List<Roles> listarRoles();

}
