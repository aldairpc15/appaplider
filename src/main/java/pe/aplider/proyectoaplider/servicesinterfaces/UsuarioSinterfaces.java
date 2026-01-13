package pe.aplider.proyectoaplider.servicesinterfaces;

import pe.aplider.proyectoaplider.entities.Usuario;

import java.util.List;

public interface UsuarioSinterfaces {

    //Listar Usuario
    public List<Usuario> listar();

    //Registrar Usuario
    public void registrar(Usuario usuario);

    //Listar por Id Usuario
    public Usuario listarId(int id);

    //Actualizar Usuario
    public void actualizar(Usuario usuario);

    //Eliminar Usuario
    void eliminar(int id);
}
