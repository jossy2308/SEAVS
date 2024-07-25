package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.EmpresaUsuarios;

public interface EmpresaUsuarioServicio {
	
	public void ingresarUsuarioE (EmpresaUsuarios nuevoUsuarioEmp);
	
	public List<EmpresaUsuarios> listarUsuarioEmp();

}
