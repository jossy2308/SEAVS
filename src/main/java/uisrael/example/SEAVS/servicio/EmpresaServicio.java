package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.Empresas;

public interface EmpresaServicio {
	
	public void ingresarEmpresa (Empresas nuevaEmpresa);
	
	public List<Empresas> listarEmpresas();

}
