package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.VehiculoDetalle;

@Repository
public interface VehiculoDetalleRepositorio extends JpaRepository<VehiculoDetalle, Integer>{

}
