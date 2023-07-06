package com.example.backend.service;
import com.example.backend.model.Tache;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface TacheService {
    //create a tache

    Tache createTache(Tache tache);

    //read taches

    List<Tache> getTache();

    //read tache by id

    Tache getTacheById(long id);

    //delete tache by id

    void deleteTacheById(long id);

    //update a tache by id

    Tache updateTacheById(Tache tache, long id);

    //search by field

    List<Tache> searchByField(String field);

    //searchByDescription

    List<Tache> searchByDescription(String description);

    //search by field and description

    List<Tache> searchByFieldDescription(String field, String description);
}
