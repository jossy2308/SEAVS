package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.Empresas;
import uisrael.example.SEAVS.repository.EmpresasRepositorio;
import uisrael.example.SEAVS.servicio.EmpresaServicio;

@Service
@Component

public class EmpresaServicioImpl implements EmpresaServicio {
	
	@Autowired
	private EmpresasRepositorio repositorioEmpresa;

	@Override
	public void ingresarEmpresa(Empresas nuevaEmpresa) {
		try {
			repositorioEmpresa.save(nuevaEmpresa);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Empresas> listarEmpresas() {
		return repositorioEmpresa.findAll();
	}

}
