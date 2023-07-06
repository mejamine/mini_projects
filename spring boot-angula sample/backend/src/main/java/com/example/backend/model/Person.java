package com.example.backend.model;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Person")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nom")
    private String Nom;
    @Column(name = "prenom")
    private String Prenom;
    @Column(name = "cid")
    private long CID;
    @Column(name = "datenaissance")
    private Date date_naissance;
    @Column(name= "tache id")
    private Long num;

    public Person (){

    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public long getCID() {
        return CID;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setCID(long CID) {
        this.CID = CID;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }
}
