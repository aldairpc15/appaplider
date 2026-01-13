package pe.aplider.proyectoaplider.servicesinterfaces;

import pe.aplider.proyectoaplider.entities.Servicio;

import java.util.List;

public interface ServicioSinterfaces {

    //Listar Servicio
    public List<Servicio> listar();

    //Registrar Servicio
    public void registrar(Servicio servicio);

    //Listar por Id Servicio
    public Servicio listarId(int id);

    //Actualizar Servicio
    public void actualizar(Servicio servicio);

    //Eliminar Servicio
    void eliminar(int id);
}
