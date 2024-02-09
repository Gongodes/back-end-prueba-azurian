package cl.gonzalo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.gonzalo.dao.UsuariosDao;
import cl.gonzalo.models.Usuarios;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuariosDao dao;

	@Override
	public Iterable<Usuarios> findAll() {

		return dao.findAll();
	}

	@Override
	public void update(Usuarios usuario, Integer id) {

		Usuarios user = new Usuarios();
		user.setId(id);
		user.setNombre(usuario.getNombre());
		user.setApellido(usuario.getApellido());
		user.setTelefono(usuario.getTelefono());
		user.setDireccion(usuario.getDireccion());

		dao.save(user);

	}

	@Override
	public void save(Usuarios usuario) {
		dao.save(usuario);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);

	}

	@Override
	public Optional<Usuarios> usuario(int id) {
		return dao.findById(id);
	}

}
