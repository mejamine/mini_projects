package com.example.backend.service;
import com.example.backend.model.Tache;
import com.example.backend.repository.TacheRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TacheServiceImplm implements TacheService{

    private final TacheRepository tacheRepository;
    public TacheServiceImplm(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }

    @Override
    public Tache createTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    @Override
    public List<Tache> getTache() {
        return tacheRepository.findAll();
    }

    @Override
    public Tache getTacheById(long id) {
        return tacheRepository.findById(id).get();
    }

    @Override
    public void deleteTacheById(long id) {
        tacheRepository.deleteById(id);
    }

    @Override
    public Tache updateTacheById(Tache tache, long id) {
        Tache tache1 = tacheRepository.findById(id).get();
        if (tache.getField()!="" && tache.getField()!=null){
            tache1.setField(tache.getField());
        }
        if (tache.getDescription()!="" && tache.getDescription()!=null){
            tache1.setDescription(tache.getDescription());
        }
        return tacheRepository.save(tache1);
    }

    @Override
    public List<Tache> searchByField(String field) {
        return tacheRepository.findTacheByField(field);
    }

    @Override
    public List<Tache> searchByDescription(String description) {
        return tacheRepository.findTacheByDescription(description);
    }

    @Override
    public List<Tache> searchByFieldDescription(String field, String description) {
        return tacheRepository.findTacheByFieldDescription(field,description);
    }
}
