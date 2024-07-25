package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.RolesPermisos;

@Repository
public interface RolesPermisoRepositorio extends JpaRepository<RolesPermisos, Integer> {

}
