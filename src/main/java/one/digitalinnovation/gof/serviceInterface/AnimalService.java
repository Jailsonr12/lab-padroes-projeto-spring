package one.digitalinnovation.gof.serviceInterface;

import one.digitalinnovation.gof.model.Animal;

import java.util.List;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author falvojr
 */
public interface AnimalService {

	List<Animal> findAll();

	void save(Animal animal);
}
