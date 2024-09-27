package backend.project.repositories;

import backend.project.entities.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequisitoRepository extends JpaRepository<Habilidad, Integer> {

}
