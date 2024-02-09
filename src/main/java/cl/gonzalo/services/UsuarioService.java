package cl.gonzalo.services;





import java.util.Optional;

import cl.gonzalo.models.Usuarios;


public interface UsuarioService {
	
	
	    public Iterable<Usuarios> findAll();

	    public void save (Usuarios usuario);
	    
	    public void update(Usuarios usuario, Integer id);
	    
	    public void delete (Integer id);
	    
	    public Optional<Usuarios> usuario(int id);

		

}
