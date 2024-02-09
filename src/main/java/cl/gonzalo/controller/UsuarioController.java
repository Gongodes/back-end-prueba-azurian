package cl.gonzalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("save")
	public String save(@RequestBody Usuarios usuario) {

		service.save(usuario);

		return "El usuario se ha guardado correctamente.";
	}

	@PutMapping("update/{id}")
	public String update(@PathVariable("id") Integer id, @RequestBody Usuarios usuario) {

		if (service.usuario(id) == null) {

			return "El usuario " + id + " no existe.";

		} else {

			service.update(usuario, id);
		}

		return "El usuario " + id + " ha sido actualizado exitosamente.";
	}

	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		try {
			service.delete(id);
		} catch (Exception e) {

			return "El id " + id + " no se encuentra presente en la lista";
		}
		return "El usuario " + id + " ha sido eliminado exitosamente.";
	}

}
