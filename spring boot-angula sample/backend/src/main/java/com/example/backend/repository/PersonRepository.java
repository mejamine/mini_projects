package com.example.backend.repository;
import com.example.backend.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {


    @Query("select p from Person p where " + "p.Nom=:nom")
     List<Person> findByNom(String nom);
    @Query("select p from Person p where " + "p.Prenom=:prenom")
    List<Person> findByPrenom(String prenom);
    @Query("select p from Person p where " + "p.CID=:cid")
    List<Person> findByCID(long cid);
    @Query("select p from Person p where " + "p.date_naissance<:date1 and p.date_naissance>:date2")
    List<Person> findByPeriod(Date date1, Date date2);
    @Query("SELECT p FROM Person p WHERE " + "p.date_naissance=:datenaissance")
    List<Person> findByDateNaissance(Date datenaissance);
    @Query("SELECT p FROM Person p WHERE " + "(p.Nom=:nom and p.Prenom=:prenom)")
    List<Person> findByNomPrenom(String nom, String prenom);
    @Query("SELECT p FROM Person p WHERE " + "(p.Nom=:nom and p.CID=:cid)")
    List<Person> findByNomCID(String nom, long cid);
    @Query("select p from Person p where " + "(p.Nom=:nom and p.date_naissance=:datenaissance)")
    List<Person> findByNomDatenaissance(String nom, Date datenaissance);
    @Query("select p from Person p where " + "p.Nom=:nom and p.date_naissance<:date1 and p.date_naissance>:date2")
    List<Person> findByNomPeriod(String nom, Date date1, Date date2);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.CID=:cid")
    List<Person> findByPrenomCID(String prenom , long cid);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.date_naissance=:datenaissance")
    List<Person> findByPrenomDatenaissance(String prenom, Date datenaissance);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.date_naissance<:date1 and p.date_naissance>:date2")
    List<Person> findByPrenomPeriod(String prenom, Date date1, Date date2);
    @Query("select p from Person p where " + "p.CID=:cid and p.date_naissance=:datenaissance")
    List<Person> findByCID_Datenaissance(long cid, Date datenaissance);
    @Query("select p from Person p where " + "p.CID=:cid and p.date_naissance<:date1 and p.date_naissance>:date2")
    List<Person> findByCID_Period(long cid, Date date1, Date date2);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.CID=:cid")
    List<Person> findByNomPrenomCID(String nom, String prenom, long cid);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.date_naissance=:datenaissance")
    List<Person> findByNomPrenomDatenaissance(String nom, String prenom, Date datenaissance);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.date_naissance<:date1 and p.date_naissance>:date2")
    List<Person> findByNomPrenomPeriod(String nom, String prenom, Date date1, Date date2);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.CID=:cid and p.date_naissance=:datenaissance")
    List<Person> findByPrenomCID_Datenaissance(String prenom, long cid, Date datenaissance);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.CID=:cid and p.date_naissance<:date1 and p.date_naissance>:date2")
    List<Person> findByPrenomCID_Period(String prenom, long cid, Date date1,Date date2);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.CID=:cid and p.date_naissance=:datenaissance")
    List<Person> findByNomPrenomCID_Datenaissance(String nom, String prenom, long cid, Date datenaissance);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.CID=:cid and p.date_naissance<:date1 and p.date_naissance>:date2")
    List<Person> findByNomPrenomCID_Period(String nom, String prenom, long cid, Date date1, Date date2);






    @Query("select p from Person p where " + "p.num=:num")
    List<Person> findByNum(Long num);
    @Query("select p from Person p where" + "(p.Nom=:nom and p.num=:num)")
    List<Person> findByNomNum(String nom, Long num);
    @Query("select p from Person  p where" + "(p.Prenom=:prenom and p.num=:num)")
    List<Person> findByPrenomNum(String prenom, Long num);
    @Query("select p from Person p where" + "(p.CID=:cid and p.num=:num)")
    List<Person> findByCidNum(long cid,Long num);
    @Query("SELECT p FROM Person p WHERE " + "(p.date_naissance=:datenaissance and p.num=:num)")
    List<Person> findByDateNaissanceNum(Date datenaissance,Long num);
    @Query("select p from Person p where " + "(p.date_naissance<:date1 and p.date_naissance>:date2 and p.num=:num)")
    List<Person> findByPeriodNum(Date date1, Date date2,Long num);
    @Query("SELECT p FROM Person p WHERE " + "(p.Nom=:nom and p.Prenom=:prenom and p.num=:num)")
    List<Person> findByNomPrenomNum(String nom, String prenom,Long num);
    @Query("SELECT p FROM Person p WHERE " + "(p.Nom=:nom and p.CID=:cid and p.num=:num)")
    List<Person> findByNomCIDNum(String nom, long cid, Long num);
    @Query("select p from Person p where " + "(p.Nom=:nom and p.date_naissance=:datenaissance and p.num=:num)")
    List<Person> findByNomDatenaissanceNum(String nom, Date datenaissance, Long num);
    @Query("select p from Person p where " + "p.Nom=:nom and p.date_naissance<:date1 and p.date_naissance>:date2 and p.num=:num")
    List<Person> findByNomPeriodNum(String nom, Date date1, Date date2, Long num);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.CID=:cid and p.num=:num")
    List<Person> findByPrenomCID_Num(String prenom , long cid, Long num);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.date_naissance=:datenaissance and p.num=:num")
    List<Person> findByPrenomDatenaissanceNum(String prenom, Date datenaissance,Long num);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.date_naissance<:date1 and p.date_naissance>:date2 and p.num=:num")
    List<Person> findByPrenomPeriodNum(String prenom, Date date1, Date date2, Long num);
    @Query("select p from Person p where " + "p.CID=:cid and p.date_naissance=:datenaissance and p.num=:num")
    List<Person> findByCID_DatenaissanceNum(long cid, Date datenaissance, Long num);
    @Query("select p from Person p where " + "p.CID=:cid and p.date_naissance<:date1 and p.date_naissance>:date2 and p.num=:num")
    List<Person> findByCID_PeriodNum(long cid, Date date1, Date date2,Long num);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.CID=:cid and p.num=:num")
    List<Person> findByNomPrenomCID_Num(String nom, String prenom, long cid, Long num);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.date_naissance=:datenaissance and p.num=:num")
    List<Person> findByNomPrenomDatenaissanceNum(String nom, String prenom, Date datenaissance, Long num);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.date_naissance<:date1 and p.date_naissance>:date2 and p.num=:num")
    List<Person> findByNomPrenomPeriodNum(String nom, String prenom, Date date1, Date date2, Long num);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.CID=:cid and p.date_naissance=:datenaissance and p.num=:num")
    List<Person> findByPrenomCID_DatenaissanceNum(String prenom, long cid, Date datenaissance, Long num);
    @Query("select p from Person p where " + "p.Prenom=:prenom and p.CID=:cid and p.date_naissance<:date1 and p.date_naissance>:date2 and p.num=:num")
    List<Person> findByPrenomCID_PeriodNum(String prenom, long cid, Date date1,Date date2,Long num);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.CID=:cid and p.date_naissance=:datenaissance and p.num=:num")
    List<Person> findByNomPrenomCID_DatenaissanceNum(String nom, String prenom, long cid, Date datenaissance, Long num);
    @Query("select p from Person p where " + "p.Nom=:nom and p.Prenom=:prenom and p.CID=:cid and p.date_naissance<:date1 and p.date_naissance>:date2 and p.num=:num")
    List<Person> findByNomPrenomCID_PeriodNum(String nom, String prenom, long cid, Date date1, Date date2, Long num);

    @Query("select p from Person p order by p.id")
    List<Person> getPersonId();
}

