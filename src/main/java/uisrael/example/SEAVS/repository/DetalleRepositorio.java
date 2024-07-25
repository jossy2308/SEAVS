package uisrael.example.SEAVS.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.Detalle;

@Repository

public interface DetalleRepositorio extends JpaRepository<Detalle, Integer>{
	
	List<Detalle> findByEstado(boolean estado);

}
