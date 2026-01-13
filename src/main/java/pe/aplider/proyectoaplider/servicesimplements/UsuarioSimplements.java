package pe.aplider.proyectoaplider.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.aplider.proyectoaplider.entities.Usuario;
import pe.aplider.proyectoaplider.repositories.UsuarioRepository;
import pe.aplider.proyectoaplider.servicesinterfaces.UsuarioSinterfaces;

import java.util.List;

@Service
public class UsuarioSimplements implements UsuarioSinterfaces {

    @Autowired
    private UsuarioRepository uRepository;

    //Listar Usuario
    @Override
    public List<Usuario> listar() {return uRepository.findAll();}

    //Registrar Usuario
    @Override
    public void registrar(Usuario usuario) {
        uRepository.save(usuario);
    }

    //Listar por Id Usuario
    @Override
    public Usuario listarId(int id) {
        return uRepository.findById(id).orElse(new Usuario());
    }

    //Actualizar Usuario
    @Override
    public void actualizar(Usuario usuario) {uRepository.save(usuario); }

    //Eliminar Usuario
    @Override
    public void eliminar(int id) {
        uRepository.deleteById(id);
    }
}
