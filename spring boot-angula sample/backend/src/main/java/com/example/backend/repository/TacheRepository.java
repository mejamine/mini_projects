package com.example.backend.repository;
import com.example.backend.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TacheRepository extends JpaRepository<Tache,Long> {

    @Query("select t from Tache t where " + "t.field=:field")
    List<Tache> findTacheByField(String field);
    @Query("select t from Tache t where " + "t.description=:description")
    List<Tache> findTacheByDescription(String description);
    @Query("select t from Tache t where " + "(t.field=:field and t.description=:description)")
    List<Tache> findTacheByFieldDescription(String field, String description);


}
