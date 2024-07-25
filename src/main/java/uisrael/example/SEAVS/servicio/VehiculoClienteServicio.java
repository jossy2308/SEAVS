package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.VehiculoClientes;

public interface VehiculoClienteServicio {
	
	public void ingresarVehiculoCliente (VehiculoClientes nuevoVehCliente);
	
	public List<VehiculoClientes> listarVehCliente();

}
