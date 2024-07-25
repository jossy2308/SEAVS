package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.EstadoVehiculo;
import uisrael.example.SEAVS.repository.EstadoVehiculoRepositorio;
import uisrael.example.SEAVS.servicio.EstadoVehiculoServicio;

@Service
@Component
public class EstadoVehiculoServicioImpl implements EstadoVehiculoServicio{

	@Autowired
	private EstadoVehiculoRepositorio repositorioEstVeh;
	@Override
	public void ingresarEstVeh(EstadoVehiculo nuevoEstVeh) {
		try {
			repositorioEstVeh.save(nuevoEstVeh);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<EstadoVehiculo> listarEstVeh() {
	
		return repositorioEstVeh.findAll();
	}

}
