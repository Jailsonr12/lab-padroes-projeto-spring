package one.digitalinnovation.gof.Reposutory;

import one.digitalinnovation.gof.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {

}