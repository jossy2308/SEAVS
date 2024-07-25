package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.Vehiculo;
import uisrael.example.SEAVS.repository.VehiculoRepositorio;
import uisrael.example.SEAVS.servicio.VehiculoServicio;

@Service
@Component
public class VehiculoServicioImpl implements VehiculoServicio{

	@Autowired
	private VehiculoRepositorio repVehiculo;
	@Override
	public void ingresarVehiculo(Vehiculo nuevoVehiculo) {
		try {
			repVehiculo.save(nuevoVehiculo);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Vehiculo> listarVehiculos() {
	
		return repVehiculo.findAll();
	}

	@Override
	public Vehiculo findById(int idVehiculo) {
		return repVehiculo.findById(idVehiculo).orElse(null);
	}

}

