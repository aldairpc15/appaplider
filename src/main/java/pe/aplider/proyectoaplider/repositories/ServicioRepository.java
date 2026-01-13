package pe.aplider.proyectoaplider.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.aplider.proyectoaplider.entities.Servicio;

public interface ServicioRepository  extends JpaRepository<Servicio, Integer> {
}
