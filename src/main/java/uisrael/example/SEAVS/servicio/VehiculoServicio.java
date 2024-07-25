package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.Vehiculo;

public interface VehiculoServicio {
	
	public void ingresarVehiculo (Vehiculo nuevoVehiculo);
	
	public List<Vehiculo> listarVehiculos();
	
	public Vehiculo findById(int idVehiculo);

}
