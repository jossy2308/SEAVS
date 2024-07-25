package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.VehiculoDetalle;

public interface VehiculoDetalleServicio {
	
	public void ingresarVehiculoDetalle (VehiculoDetalle nuevoVehDetalle);
	
	public List<VehiculoDetalle> listarVehDetalle();

}
