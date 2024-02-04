package cl.gonzalo.services;

import java.util.List;

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
}
