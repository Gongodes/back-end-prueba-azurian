package cl.gonzalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.gonzalo.models.Usuarios;
import cl.gonzalo.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping()
	@CrossOrigin(origins = "http://localhost:4200")
	public Iterable<Usuarios> list() {
		return service.findAll();
	}

}
