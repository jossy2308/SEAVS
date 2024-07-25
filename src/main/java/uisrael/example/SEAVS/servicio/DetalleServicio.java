package uisrael.example.SEAVS.servicio;

import java.util.List;

import uisrael.example.SEAVS.entidades.Detalle;

public interface DetalleServicio {
	
	public void ingresarDetalle (Detalle nuevoDetalle);
	
	public List<Detalle> listarDetalle();
	
	List<Detalle> listarDetallesActivos();

}
