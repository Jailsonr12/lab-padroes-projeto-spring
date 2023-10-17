package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.Repository.AnimalRepository;
import one.digitalinnovation.gof.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService implements  one.digitalinnovation.gof.serviceInterface.AnimalService {

    @Autowired
    private AnimalRepository animalRepository;


    @Override
    public void save(Animal animal) {
        if(animal.getId()==null)
            System.out.println("SAVE - Recebendo o animal na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o animal na camada de repositório");

        System.out.println(animal);
    }

    public List<Animal> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Animal> animal = new ArrayList<>();
        animal.add(new Animal("Tom","Gato","pardo"));
        animal.add(new Animal("Rex","Cachorro","branco"));
        return animal;
    }
}
