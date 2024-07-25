package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.VehiculosPrecios;

@Repository
public interface VehiculoPrecioRepositorio extends JpaRepository<VehiculosPrecios, Integer> {

}
