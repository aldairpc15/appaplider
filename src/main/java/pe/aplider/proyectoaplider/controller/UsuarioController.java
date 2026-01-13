package pe.aplider.proyectoaplider.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.aplider.proyectoaplider.DTO.UsuarioDTO;
import pe.aplider.proyectoaplider.entities.Usuario;
import pe.aplider.proyectoaplider.servicesinterfaces.UsuarioSinterfaces;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioSinterfaces Uinterfaces;

    //Listar Usuario
    @GetMapping("/listar")
    public List<UsuarioDTO> usuarioDTO(){
        return Uinterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Usuario
    @PostMapping("/registrar")
    public void registrar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(usuarioDTO, Usuario.class);
        Uinterfaces.registrar(usuario);
    }

    //Listar por Id Usuario
    @GetMapping("/buscarporid/{id}")
    public UsuarioDTO listarId(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO usuarioDTO=m.map(Uinterfaces.listarId(id),UsuarioDTO.class);
        return usuarioDTO;
    }

    //Actualizar Usuario
    @PutMapping("/actualizar")
    public void actualizar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m=new ModelMapper();
        Usuario user=m.map(usuarioDTO,Usuario.class);
        Uinterfaces.actualizar(user);
    }

    //Eliminar Usuario
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") int id){
        Uinterfaces.eliminar(id);
    }

}
