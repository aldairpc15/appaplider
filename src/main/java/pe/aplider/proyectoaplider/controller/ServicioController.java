package pe.aplider.proyectoaplider.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.aplider.proyectoaplider.DTO.ServicioDTO;
import pe.aplider.proyectoaplider.entities.Servicio;
import pe.aplider.proyectoaplider.servicesinterfaces.ServicioSinterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    private ServicioSinterfaces Sinterfaces;

    //Listar Servicio
    @GetMapping("/listar")
    public List<ServicioDTO> servicioDTO(){
        return Sinterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ServicioDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Servicio
    @PostMapping("/registrar")
    public void registrar(@RequestBody ServicioDTO servicioDTO) {
        ModelMapper m = new ModelMapper();
        Servicio servicio = m.map(servicioDTO, Servicio.class);
        Sinterfaces.registrar(servicio);
    }

    //Listar por Id Servicio
    @GetMapping("/buscarporid/{id}")
    public ServicioDTO listarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        ServicioDTO servicioDTO=m.map(Sinterfaces.listarId(id),ServicioDTO.class);
        return servicioDTO;
    }

    //Actualizar Servicio
    @PutMapping("/actualizar")
    public void actualizar(@RequestBody ServicioDTO servicioDTO){
        ModelMapper m=new ModelMapper();
        Servicio servicio=m.map(servicioDTO,Servicio.class);
        Sinterfaces.actualizar(servicio);
    }

    //Eliminar Servicio
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id){
        Sinterfaces.eliminar(id);
    }
}
