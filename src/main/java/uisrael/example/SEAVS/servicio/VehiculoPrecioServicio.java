package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.VehiculosPrecios;

public interface VehiculoPrecioServicio {
	
	public void ingresarVehPrecio (VehiculosPrecios nuevoVehPrecios);
	
	public List<VehiculosPrecios> listarVehPrecios();
	
	
	
	

}
