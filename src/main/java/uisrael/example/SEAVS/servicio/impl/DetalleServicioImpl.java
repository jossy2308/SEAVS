package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.Detalle;
import uisrael.example.SEAVS.repository.DetalleRepositorio;
import uisrael.example.SEAVS.servicio.DetalleServicio;

@Service
@Component

public class DetalleServicioImpl implements DetalleServicio{
	
	@Autowired
	private DetalleRepositorio repositorioDetalle;

	@Override
	public void ingresarDetalle(Detalle nuevoDetalle) {
		try {
			repositorioDetalle.save(nuevoDetalle);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Detalle> listarDetalle() {
		return repositorioDetalle.findAll();
	}

	@Override
	public List<Detalle> listarDetallesActivos() {
		return repositorioDetalle.findByEstado(true);
	}

}

