package uisrael.example.SEAVS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.Clientes;

@Repository
public interface ClientesRepositorio extends JpaRepository<Clientes, Integer> {


}
