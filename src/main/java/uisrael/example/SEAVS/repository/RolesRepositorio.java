package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.Roles;

@Repository
public interface RolesRepositorio extends JpaRepository<Roles , Integer>{

}
