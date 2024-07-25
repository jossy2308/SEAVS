package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.Clientes;
import uisrael.example.SEAVS.repository.ClientesRepositorio;
import uisrael.example.SEAVS.servicio.ClientesServicio;

@Service
@Component
public class ClienteServicioImpl implements ClientesServicio{
	
	@Autowired
	private ClientesRepositorio repositorioCliente;
	
	
	@Override
	public void ingresarCliente(Clientes nuevoCliente) {
		try {
			repositorioCliente.save(nuevoCliente);
		} catch (Exception e) {
			throw e;
		}
		
	}


	@Override
	public List<Clientes> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
