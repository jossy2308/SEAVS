package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.VehiculosPrecios;
import uisrael.example.SEAVS.repository.VehiculoPrecioRepositorio;
import uisrael.example.SEAVS.servicio.VehiculoPrecioServicio;

@Service
@Component

public class VehiculoPrecioServicioImpl implements VehiculoPrecioServicio{
	

	@Autowired
	private VehiculoPrecioRepositorio repVehPrecio;
	@Override
	public void ingresarVehPrecio(VehiculosPrecios nuevoVehPrecios) {
		try {
			repVehPrecio.save(nuevoVehPrecios);
		} catch (Exception e) {
			
		}
	}

	@Override
	public List<VehiculosPrecios> listarVehPrecios() {
	
		return repVehPrecio.findAll();
	}

}
