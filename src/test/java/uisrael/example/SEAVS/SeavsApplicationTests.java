package uisrael.example.SEAVS;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import uisrael.example.SEAVS.entidades.Clientes;
import uisrael.example.SEAVS.servicio.ClientesServicio;

@SpringBootTest
class SeavsApplicationTests {
	
	@Autowired
	private ClientesServicio servicio;

	@Test
	void contextLoads() {
	/*	Clientes nuevoCliente = new Clientes();
		nuevoCliente.setNombresCliente("Jossy");
		nuevoCliente.setApellidosCliente("Tapia");
		nuevoCliente.setEmail("josdsdjs");
		nuevoCliente.setIdentificacion("123456");
		nuevoCliente.setTelefono("986756564");
		nuevoCliente.setFechaRegistro(new Date());
		
		servicio.ingresarCliente(nuevoCliente);*/
	}

}
