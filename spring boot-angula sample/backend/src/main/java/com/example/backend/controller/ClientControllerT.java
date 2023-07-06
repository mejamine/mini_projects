package com.example.backend.controller;
import com.example.backend.model.Tache;
import com.example.backend.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Service
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientControllerT {


    @Autowired(required = false)
    private TacheService tacheService;


    //create Tache
    @PostMapping("/tache")
    public Tache createTache(@RequestBody Tache tache){
        Tache tache1 = tacheService.createTache(tache);
        return tache1;
    }

    //Read Taches
    @GetMapping("/tache")
    public List<Tache> getTaches(){
        return tacheService.getTache();
    }

    //update Taches
    @PutMapping("/tache/{id}")
    public Tache updateTacheById(@RequestBody Tache tache , @PathVariable("id") long id){
        return tacheService.updateTacheById(tache,id);
    }

    //Delete Tache by id
    @DeleteMapping("/tache/{id}")
    public String deleteTache(@PathVariable("id") long id){
        tacheService.deleteTacheById(id);
        return "tache is successfully deleted";
    }

    //Get Tache by id
    @GetMapping("/tache/{id}")
    public Tache getTacheById(@PathVariable("id") long id){
        return tacheService.getTacheById(id);
    }

    //get Taches by field
    @GetMapping("/tache/field={field}")
    public List<Tache> getTacheByField(@PathVariable("field") String field){
        return tacheService.searchByField(field);
    }

    //get Taches by description
    @GetMapping("/tache/description={description}")
    public List<Tache> getTachesByDescription(@PathVariable("description") String description){
        return tacheService.searchByDescription(description);
    }

    //gest Taches by field and description
    @GetMapping("/tache/field={field}/description={description}")
    public List<Tache> getTacheByFieldDesc(@PathVariable("field") String field, @PathVariable("description") String description){
        return tacheService.searchByFieldDescription(field,description);
    }

}
