package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.VehiculoClientes;

@Repository
public interface VehiculoClienteRepositorio extends JpaRepository<VehiculoClientes, Integer>{

}
