package pe.aplider.proyectoaplider.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.aplider.proyectoaplider.entities.Usuario;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByNombre(String nombre);

    // Contar cuántos usuarios tienen ese nombre
    @Query("SELECT COUNT(u) FROM Usuario u WHERE u.nombre = :nombre")
    int contarPorNombre(@Param("nombre") String nombre);
}
