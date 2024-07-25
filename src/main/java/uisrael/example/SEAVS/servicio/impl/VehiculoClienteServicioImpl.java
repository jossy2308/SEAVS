package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.VehiculoClientes;
import uisrael.example.SEAVS.repository.VehiculoClienteRepositorio;
import uisrael.example.SEAVS.servicio.VehiculoClienteServicio;

@Service
@Component

public class VehiculoClienteServicioImpl implements VehiculoClienteServicio{

	@Autowired
	private VehiculoClienteRepositorio repVehCliente;
	@Override
	public void ingresarVehiculoCliente(VehiculoClientes nuevoVehCliente) {
		try {
			repVehCliente.save(nuevoVehCliente);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<VehiculoClientes> listarVehCliente() {
		// TODO Auto-generated method stub
		return repVehCliente.findAll();
	}

}
