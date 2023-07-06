package com.example.backend.service;
import com.example.backend.model.Person;
import com.example.backend.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class PersonServiceImplm implements PersonService{

    private final PersonRepository personRepository;

    public PersonServiceImplm(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getPersonorder() {
        return  personRepository.getPersonId();
    }



    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getPerson() {
        return  personRepository.findAll();
    }

    @Override
    public Person getPersonById(long id) {
        return personRepository.findById(id).get();
    }

    @Override
    public void deletePersonById(long id) {
        personRepository.deleteById(id);
    }

    @Override
    public boolean setpersonNum(Long id) {
        List<Person> person = personRepository.findByNum(id);
        for (Person person1 : person) {
            person1.setNum(0L);
            personRepository.save(person1);
        }

        return true;
    }

    @Override
    public Person updatePersonById(Person person, long id) {
        Person person1 = personRepository.findById(id).get();
        if (person.getNom()!="" && person.getNom()!=null){
            person1.setNom(person.getNom());
        }
        if (person.getPrenom()!="" && person.getPrenom()!=null){
            person1.setPrenom(person.getPrenom());
        }
        if (person.getCID()!= 0){
            person1.setCID(person.getCID());
        }
        if (person.getDate_naissance()!=null){
            person1.setDate_naissance(person.getDate_naissance());
        }
        if (person.getNum()!=null){
            person1.setNum(person.getNum());
        }
        return personRepository.save(person1);
    }


    @Override
    public List<Person> searchByNom(String nom) {
        return personRepository.findByNom(nom);
    }

    @Override
    public List<Person> searchByPrenom(String prenom) {
        return personRepository.findByPrenom(prenom);
    }

    @Override
    public List<Person> searchByCID(long cid) {
        return personRepository.findByCID(cid);
    }

    @Override
    public List<Person> searchByDatenaissance(Date datenaissance) {
        return personRepository.findByDateNaissance(datenaissance);
    }

    @Override
    public List<Person> searchByPeriod(Date date1, Date date2) {
        return personRepository.findByPeriod(date1,date2);
    }

    @Override
    public List<Person> searchByNum(Long num) {
        return personRepository.findByNum(num);
    }

    @Override
    public List<Person> searchByNomPrenom(String nom, String prenom) {
        return personRepository.findByNomPrenom(nom,prenom);
    }

    @Override
    public List<Person> searchByNomCID(String nom, long cid) {
        return personRepository.findByNomCID(nom,cid);
    }

    @Override
    public List<Person> searchByNomDatenaissance(String nom, Date datenaissance) {
        return personRepository.findByNomDatenaissance(nom,datenaissance);
    }

    @Override
    public List<Person> searchByNomPeriod(String nom, Date date1, Date date2) {
        return personRepository.findByNomPeriod(nom,date1,date2);
    }

    @Override
    public List<Person> searchByPrenomCID(String prenom, long cid) {
        return personRepository.findByPrenomCID(prenom,cid);
    }

    @Override
    public List<Person> searchByPrenomDatenaissance(String prenom, Date datenaissance) {
        return personRepository.findByPrenomDatenaissance(prenom,datenaissance);
    }

    @Override
    public List<Person> searchByPrenomPeriod(String prenom, Date date1, Date date2) {
        return personRepository.findByPrenomPeriod(prenom,date1,date2);
    }

    @Override
    public List<Person> searchByCID_Datenaissance(long cid, Date datenaissance) {
        return personRepository.findByCID_Datenaissance(cid , datenaissance);
    }

    @Override
    public List<Person> searchByCID_Period(long cid, Date date1, Date date2) {
        return personRepository.findByCID_Period(cid,date1,date2);
    }

    @Override
    public List<Person> searchByNomPrenomCID(String nom, String prenom, long cid) {
        return personRepository.findByNomPrenomCID(nom,prenom,cid);
    }

    @Override
    public List<Person> searchByNomPrenomDatenaissance(String nom, String prenom, Date datenaissance) {
        return personRepository.findByNomPrenomDatenaissance(nom,prenom,datenaissance);
    }

    @Override
    public List<Person> searchByNomPrenomPeriod(String nom, String prenom, Date date1, Date date2) {
        return personRepository.findByNomPrenomPeriod(nom,prenom,date1,date2);
    }

    @Override
    public List<Person> searchByPrenomCID_Datenaissance(String prenom, long cid, Date datenaissance) {
        return personRepository.findByPrenomCID_Datenaissance(prenom,cid,datenaissance);
    }

    @Override
    public List<Person> searchByPrenomCID_Period(String prenom, long cid, Date date1, Date date2) {
        return personRepository.findByPrenomCID_Period(prenom,cid,date1,date2);
    }

    @Override
    public List<Person> searchByNomPrenomCID_Datenaissance(String nom, String prenom, long cid, Date datenaissance) {
        return personRepository.findByNomPrenomCID_Datenaissance(nom,prenom,cid,datenaissance);
    }

    @Override
    public List<Person> searchByNomPrenomCID_Period(String nom, String prenom, long cid, Date date1, Date date2) {
        return personRepository.findByNomPrenomCID_Period(nom,prenom,cid,date1,date2);
    }

    @Override
    public List<Person> searchByNomNum(String nom, Long num) {
        return personRepository.findByNomNum(nom,num);
    }

    @Override
    public List<Person> searchByPrenomNum(String prenom, Long num) {
        return personRepository.findByPrenomNum(prenom,num);
    }

    @Override
    public List<Person> searchByCID_Num(long cid, Long num) {
        return personRepository.findByCidNum(cid,num);
    }

    @Override
    public List<Person> searchByDatenaissanceNum(Date datenaissance, Long num) {
        return personRepository.findByDateNaissanceNum(datenaissance,num);
    }

    @Override
    public List<Person> searchByPeriodNum(Date date1, Date date2, Long num) {
        return personRepository.findByPeriodNum(date1,date2,num);
    }

    @Override
    public List<Person> searchByNomPrenomNum(String nom, String prenom, Long num) {
        return personRepository.findByNomPrenomNum(nom,prenom,num);
    }

    @Override
    public List<Person> searchByNomCID_Num(String nom, long cid, Long num) {
        return personRepository.findByNomCIDNum(nom,cid,num);
    }

    @Override
    public List<Person> searchByNomDatenaissanceNum(String nom, Date datenaissance, Long num) {
        return personRepository.findByNomDatenaissanceNum(nom,datenaissance,num);
    }

    @Override
    public List<Person> searchByNomPeriodNum(String nom, Date date1, Date date2, Long num) {
        return personRepository.findByNomPeriodNum(nom,date1,date2,num);
    }

    @Override
    public List<Person> searchByPrenomCID_Num(String prenom, long cid, Long num) {
        return personRepository.findByPrenomCID_Num(prenom,cid,num);
    }

    @Override
    public List<Person> searchByPrenomDatenaissanceNum(String prenom, Date datenaissance, Long num) {
        return personRepository.findByPrenomDatenaissanceNum(prenom,datenaissance,num);
    }

    @Override
    public List<Person> searchByPrenomPeriodNum(String prenom, Date date1, Date date2, Long num) {
        return personRepository.findByPrenomPeriodNum(prenom,date1,date2,num);
    }

    @Override
    public List<Person> searchByCID_DatenaissanceNum(long cid, Date datenaissance, Long num) {
        return personRepository.findByCID_DatenaissanceNum(cid,datenaissance,num);
    }

    @Override
    public List<Person> searchByCID_PeriodNum(long cid, Date date1, Date date2, Long num) {
        return personRepository.findByCID_PeriodNum(cid,date1,date2,num);
    }

    @Override
    public List<Person> searchByNomPrenomCID_Num(String nom, String prenom, long cid, Long num) {
        return personRepository.findByNomPrenomCID_Num(nom,prenom,cid,num);
    }

    @Override
    public List<Person> searchByNomPrenomDatenaissanceNum(String nom, String prenom, Date datenaissance, Long num) {
        return personRepository.findByNomPrenomDatenaissanceNum(nom,prenom,datenaissance,num);
    }

    @Override
    public List<Person> searchByNomPrenomPeriodNum(String nom, String prenom, Date date1, Date date2, Long num) {
        return personRepository.findByNomPrenomPeriodNum(nom,prenom,date1,date2,num);
    }

    @Override
    public List<Person> searchByPrenomCID_DatenaissanceNum(String prenom, long cid, Date datenaissance, Long num) {
        return personRepository.findByPrenomCID_DatenaissanceNum(prenom,cid,datenaissance,num);
    }

    @Override
    public List<Person> searchByPrenomCID_PeriodNum(String prenom, long cid, Date date1, Date date2, Long num) {
        return personRepository.findByPrenomCID_PeriodNum(prenom,cid,date1,date2,num);
    }

    @Override
    public List<Person> searchByNomPrenomCID_DatenaissanceNum(String nom, String prenom, long cid, Date datenaissance, Long num) {
        return personRepository.findByNomPrenomCID_DatenaissanceNum(nom,prenom,cid,datenaissance,num);
    }

    @Override
    public List<Person> searchByNomPrenomCID_PeriodNum(String nom, String prenom, long cid, Date date1, Date date2, Long num) {
        return personRepository.findByNomPrenomCID_PeriodNum(nom,prenom,cid,date1,date2,num);
    }


}


