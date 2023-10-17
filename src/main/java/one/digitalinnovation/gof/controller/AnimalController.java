package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Animal;
import one.digitalinnovation.gof.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping()
    public List<Animal> getUsers(){
        return animalService.findAll();
    }

    @PostMapping()
    public void postUser(@RequestBody Animal animal){
        animalService.save(animal);
    }
}
