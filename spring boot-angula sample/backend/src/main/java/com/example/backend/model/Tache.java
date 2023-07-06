package com.example.backend.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Tache")
public class Tache {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "field")
    private String field;
    @Column(name = "description")
    private String description;


    public Tache() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
