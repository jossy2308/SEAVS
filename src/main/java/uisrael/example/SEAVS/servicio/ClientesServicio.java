package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.Clientes;

public interface ClientesServicio {
	
	public void ingresarCliente (Clientes nuevoCliente);
	
	public List<Clientes> listarClientes();
	
}
