package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.EstadoVehiculo;

public interface EstadoVehiculoServicio {
	
	public void ingresarEstVeh (EstadoVehiculo nuevoEstVeh);
	
	public List<EstadoVehiculo> listarEstVeh();

}
