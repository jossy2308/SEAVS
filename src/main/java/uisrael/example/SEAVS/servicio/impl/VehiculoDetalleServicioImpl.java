package uisrael.example.SEAVS.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uisrael.example.SEAVS.entidades.VehiculoDetalle;
import uisrael.example.SEAVS.repository.VehiculoDetalleRepositorio;
import uisrael.example.SEAVS.servicio.VehiculoDetalleServicio;


@Service
@Component

public class VehiculoDetalleServicioImpl implements VehiculoDetalleServicio {

	@Autowired
	private VehiculoDetalleRepositorio repVehDetalle;
	@Override
	public void ingresarVehiculoDetalle(VehiculoDetalle nuevoVehDetalle) {
		try {
			repVehDetalle.save(nuevoVehDetalle);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<VehiculoDetalle> listarVehDetalle() {
		
		return repVehDetalle.findAll();
	}

}
