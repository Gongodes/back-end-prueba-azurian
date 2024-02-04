package cl.gonzalo.dao;

import org.springframework.data.repository.CrudRepository;

import cl.gonzalo.models.Usuarios;

public interface UsuariosDao extends CrudRepository<Usuarios, Integer> {

}
