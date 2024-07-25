package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.Permisos;

@Repository
public interface PermisosRepositorio extends JpaRepository<Permisos, Integer> {

}
