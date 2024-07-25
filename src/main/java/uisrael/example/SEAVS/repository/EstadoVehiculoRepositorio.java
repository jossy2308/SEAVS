package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.EstadoVehiculo;

@Repository

public interface EstadoVehiculoRepositorio extends JpaRepository<EstadoVehiculo, Integer> {

}
