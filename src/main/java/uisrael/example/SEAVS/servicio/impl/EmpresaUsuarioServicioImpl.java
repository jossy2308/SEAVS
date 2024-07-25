package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.EmpresaUsuarios;
import uisrael.example.SEAVS.repository.EmpresaUsuarioRepositorio;
import uisrael.example.SEAVS.servicio.EmpresaUsuarioServicio;

@Service
@Component
public class EmpresaUsuarioServicioImpl implements EmpresaUsuarioServicio {

	@Autowired
	private EmpresaUsuarioRepositorio repositorioEmpUsu;
	
	@Override
	public void ingresarUsuarioE(EmpresaUsuarios nuevoUsuarioEmp) {
		try {
			repositorioEmpUsu.save(nuevoUsuarioEmp);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	@Override
	public List<EmpresaUsuarios> listarUsuarioEmp() {
		
		return repositorioEmpUsu.findAll();
	}

}
