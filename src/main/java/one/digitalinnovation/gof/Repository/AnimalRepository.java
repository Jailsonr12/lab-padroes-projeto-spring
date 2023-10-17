package one.digitalinnovation.gof.Repository;

import one.digitalinnovation.gof.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

}