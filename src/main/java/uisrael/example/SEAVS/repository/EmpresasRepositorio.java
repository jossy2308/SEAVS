package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.Empresas;

@Repository
public interface EmpresasRepositorio extends JpaRepository<Empresas, Integer> {

}
