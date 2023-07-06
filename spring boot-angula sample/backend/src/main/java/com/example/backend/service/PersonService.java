package com.example.backend.service;
import org.springframework.stereotype.Service;
import com.example.backend.model.Person;
import java.sql.Date;
import java.util.List;

@Service

public interface PersonService {

     //get person ordred by id
     List<Person> getPersonorder();

     boolean setpersonNum(Long id);


    //create a person

     Person createPerson(Person person);

    //read persons

     List<Person> getPerson();

    //read person by id

     Person getPersonById(long id);

    //delete person by id

     void deletePersonById(long id);

    //update a person by id

     Person updatePersonById(Person person, long id);



      //search by nom
     List<Person> searchByNom(String nom);
      //search by prenom
     List<Person> searchByPrenom(String prenom);
     //search by cid
     List<Person> searchByCID(long cid);
     //search by date de naissance
     List<Person> searchByDatenaissance(Date datenaissance);
     //search by periode
     List<Person> searchByPeriod(Date date1, Date date2);
     //search by num
     List<Person> searchByNum(Long num);
     // search by nom and prenom
     List<Person> searchByNomPrenom(String nom, String prenom);
     //search by nom and cid
     List<Person> searchByNomCID(String nom, long cid);
     //search by nom and date de naissance
     List<Person> searchByNomDatenaissance(String nom, Date datenaissance);
     //search by nom and periode
     List<Person> searchByNomPeriod(String nom, Date date1, Date date2);
     //search by prenom and cid
     List<Person> searchByPrenomCID(String prenom, long cid);
     //search by prenom and date de naissance
     List<Person> searchByPrenomDatenaissance(String prenom, Date datenaissance);
     //search by prenom and period
     List<Person> searchByPrenomPeriod(String prenom, Date date1, Date date2);
     //search by cid and date de naissance
     List<Person> searchByCID_Datenaissance(long cid, Date datenaissance);
     //search by cid and periode
     List<Person> searchByCID_Period(long cid, Date date1, Date date2);
     //search by nom , prenom and cid
     List<Person> searchByNomPrenomCID(String nom, String prenom, long cid);
     //search by nom, prenom and date de naissance
     List<Person> searchByNomPrenomDatenaissance(String nom, String prenom, Date datenaissance);
     //search by nom, prenom and periode
     List<Person> searchByNomPrenomPeriod(String nom, String prenom, Date date1, Date date2);
     //search by prenom , cid and date de naissance
     List<Person> searchByPrenomCID_Datenaissance(String prenom, long cid, Date datenaissance);
     //search by prenom , cid and periode
     List<Person> searchByPrenomCID_Period(String prenom, long cid, Date date1, Date date2);
     //search by nom, prenom, cid and date de naissance
     List<Person> searchByNomPrenomCID_Datenaissance(String nom, String prenom, long cid, Date datenaissance);
     //search by nom, prenom , cid and periode
     List<Person> searchByNomPrenomCID_Period(String nom, String prenom, long cid, Date date1, Date date2);





     //search by nom et num
     List<Person> searchByNomNum(String nom, Long num);
     //search by prenom et num
     List<Person> searchByPrenomNum(String prenom, Long num);
     //search by cid et num
     List<Person> searchByCID_Num(long cid, Long num);
     //search by date de naissance et num
     List<Person> searchByDatenaissanceNum(Date datenaissance, Long num);
     //search by periode et num
     List<Person> searchByPeriodNum(Date date1, Date date2,Long num);
     // search by nom , prenom et num
     List<Person> searchByNomPrenomNum(String nom, String prenom, Long num);
     //search by nom , cid et num
     List<Person> searchByNomCID_Num(String nom, long cid, Long num);
     //search by nom , date de naissance et num
     List<Person> searchByNomDatenaissanceNum(String nom, Date datenaissance, Long num);
     //search by nom , periode and num
     List<Person> searchByNomPeriodNum(String nom, Date date1, Date date2, Long num);
     //search by prenom , cid et num
     List<Person> searchByPrenomCID_Num(String prenom, long cid, Long num);
     //search by prenom , date de naissance et num
     List<Person> searchByPrenomDatenaissanceNum(String prenom, Date datenaissance, Long num);
     //search by prenom , period et num
     List<Person> searchByPrenomPeriodNum(String prenom, Date date1, Date date2, Long num);
     //search by cid , date de naissance et num
     List<Person> searchByCID_DatenaissanceNum(long cid, Date datenaissance, Long num);
     //search by cid , periode and num
     List<Person> searchByCID_PeriodNum(long cid, Date date1, Date date2, Long num);
     //search by nom , prenom , cid et num
     List<Person> searchByNomPrenomCID_Num(String nom, String prenom, long cid, Long num);
     //search by nom, prenom , date de naissance et num
     List<Person> searchByNomPrenomDatenaissanceNum(String nom, String prenom, Date datenaissance, Long num);
     //search by nom, prenom , periode et num
     List<Person> searchByNomPrenomPeriodNum(String nom, String prenom, Date date1, Date date2, Long num);
     //search by prenom , cid , date de naissance et num
     List<Person> searchByPrenomCID_DatenaissanceNum(String prenom, long cid, Date datenaissance, Long num);
     //search by prenom , cid , periode et num
     List<Person> searchByPrenomCID_PeriodNum(String prenom, long cid, Date date1, Date date2, Long num);
     //search by nom, prenom, cid , date de naissance et num
     List<Person> searchByNomPrenomCID_DatenaissanceNum(String nom, String prenom, long cid, Date datenaissance, Long num);
     //search by nom, prenom , cid , periode et num
     List<Person> searchByNomPrenomCID_PeriodNum(String nom, String prenom, long cid, Date date1, Date date2, Long num);



}
