package uisrael.example.SEAVS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uisrael.example.SEAVS.entidades.EmpresaUsuarios;
import uisrael.example.SEAVS.entidades.Usuario;

@Repository
public interface EmpresaUsuarioRepositorio extends JpaRepository<EmpresaUsuarios, Integer> {
	EmpresaUsuarios findByFkUsuario(Usuario usuario);

}
