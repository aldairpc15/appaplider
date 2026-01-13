package pe.aplider.proyectoaplider.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.aplider.proyectoaplider.entities.Servicio;
import pe.aplider.proyectoaplider.repositories.ServicioRepository;
import pe.aplider.proyectoaplider.servicesinterfaces.ServicioSinterfaces;

import java.util.List;

@Service
public class ServicioSimplements implements ServicioSinterfaces {

    @Autowired
    private ServicioRepository sRepository;

    //Listar Servicio
    @Override
    public List<Servicio> listar() {return sRepository.findAll();}

    //Registrar Servicio
    @Override
    public void registrar(Servicio servicio) {
        sRepository.save(servicio);
    }

    //Listar por Id Servicio
    @Override
    public Servicio listarId(int id) {
        return sRepository.findById(id).orElse(new Servicio());
    }

    //Actualizar Servicio
    @Override
    public void actualizar(Servicio servicio) {sRepository.save(servicio); }

    //Eliminar Servicio
    @Override
    public void eliminar(int id) {
        sRepository.deleteById(id);
    }
}
