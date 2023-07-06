package com.example.backend.controller;
import com.example.backend.model.Person;
import com.example.backend.service.PersonService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

@Service
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientController {


    @Autowired
    private PersonService personService;


    //create Person
    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        Person person1 = personService.createPerson(person);
        return person1;
    }
    //Read Persons
    @GetMapping("/person")
    public List<Person> getPersons() {
        return personService.getPersonorder();
    }

    //update persons
    @PutMapping("/person/{id}")
    public Person updatePersonById(@RequestBody Person person, @PathVariable("id") long id) {
        return personService.updatePersonById(person, id);
    }


    //Delete Person by id
    @DeleteMapping("/person/{id}")
    public String deletePerson(@PathVariable("id") long id) {
        personService.deletePersonById(id);
        return "person is successfully deleted";
    }

    //Get Person by id
    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id") long id) {
        return personService.getPersonById(id);
    }

    //search by nom

    @GetMapping("/person/nom={nom}")
    public List<Person> searchByNom(@PathVariable("nom") String nom) {
        return personService.searchByNom(nom);
    }

    //search by prenom
    @GetMapping("/person/prenom={prenom}")
    public List<Person> searchByPrenom(@PathVariable("prenom") String prenom) {
        return personService.searchByPrenom(prenom);
    }

    //search bu cid
    @GetMapping("/person/cid={cid}")
    public List<Person> searchByCID(@PathVariable("cid") long cid) {
        return personService.searchByCID(cid);
    }

    //search by date de naissance
    @GetMapping("/person/datenaissance={datenaissance}")
    public List<Person> searchByDatenaissance(@PathVariable("datenaissance") Date datenaissance) {
        return personService.searchByDatenaissance(datenaissance);
    }

    //search By Period
    @GetMapping("/person/date1={date1}/date2={date2}")
    public List<Person> searchByPeriod(@PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {
        return personService.searchByPeriod(date1, date2);
    }

    //search by nom et prenom
    @GetMapping("/person/nom={nom}/prenom={prenom}")
    public List<Person> searchByNomPrenom(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom) {
        return personService.searchByNomPrenom(nom, prenom);
    }

    //saerch by nom et cid
    @GetMapping("/person/nom={nom}/cid={cid}")
    public List<Person> searchByNomCID(@PathVariable("nom") String nom, @PathVariable("cid") long cid) {
        return personService.searchByNomCID(nom, cid);
    }

    //search by nom et date de naissance
    @GetMapping("/person/nom={nom}/datenaissance={datenaissance}")
    public List<Person> searchByNomDatenaissance(@PathVariable("nom") String nom, @PathVariable("datenaissance") Date datenaissance) {
        return personService.searchByNomDatenaissance(nom, datenaissance);
    }

    //search by nom et periode
    @GetMapping("/person/nom={nom}/date1={date1}/date2={date2}")
    public List<Person> searchByNomPeriod(@PathVariable("nom") String nom, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {
        return personService.searchByNomPeriod(nom, date1, date2);
    }

    //saerch by prenom et cid
    @GetMapping("/person/prenom={prenom}/cid={cid}")
    public List<Person> searchByPrenomCID(@PathVariable("prenom") String prenom, @PathVariable("cid") long cid) {
        return personService.searchByPrenomCID(prenom, cid);
    }

    //search by prenom et date de naissance
    @GetMapping("/person/prenom={prenom}/datenaissance={datenaissance}")
    public List<Person> searchBPrenomDatenaissance(@PathVariable("prenom") String prenom, @PathVariable("datenaissance") Date datenaissance) {
        return personService.searchByPrenomDatenaissance(prenom, datenaissance);
    }

    //search by prenom et periode
    @GetMapping("/person/prenom={nom}/date1={date1}/date2={date2}")
    public List<Person> searchByPrenomPeriod(@PathVariable("prenom") String prenom, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {
        return personService.searchByPrenomPeriod(prenom, date1, date2);
    }

    //search by cid et date de naissance
    @GetMapping("/person/cid={cid}/datenaissance={datenaissance}")
    public List<Person> searchByCID_Datenaissance(@PathVariable("cid") long cid, @PathVariable("datenaissance") Date datenaissance) {
        return personService.searchByCID_Datenaissance(cid, datenaissance);
    }

    //search by cid periode
    @GetMapping("/person/cid={cid}/date1={date1}/date2={date2}")
    public List<Person> searchByCID_Periode(@PathVariable("cid") long cid, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {
        return personService.searchByCID_Period(cid, date1, date2);
    }

    //search by nom , prenom et cid
    @GetMapping("/person/nom={nom}/prenom={prenom}/cid={cid}")
    public List<Person> searchByNomPrenomCID(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("cid") long cid) {
        return personService.searchByNomPrenomCID(nom, prenom, cid);
    }

    //search by nom , prenom et date de naissance
    @GetMapping("/person/nom={nom}/prenom={prenom}/datenaissance={datenaissance}")
    public List<Person> searchByNomPrenomDatenaissance(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("datenaissance") Date datenaissance) {
        return personService.searchByNomPrenomDatenaissance(nom, prenom, datenaissance);
    }

    //search by nom, prenom et periode
    @GetMapping("/person/nom={nom}/prenom={prenom}/date1={date1}/date2={date2}")
    public List<Person> searchByNomPrenomPeriod(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {
        return personService.searchByNomPrenomPeriod(nom, prenom, date1, date2);
    }

    //search by prenom, cid et date de naissance
    @GetMapping("/person/prenom={prenom}/cid={cid}/datenaissance={datenaissance}")
    public List<Person> searchByPrenomCID_Datenaissance(@PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("datenaissance") Date datenaissance) {
        return personService.searchByPrenomCID_Datenaissance(prenom, cid, datenaissance);
    }

    //search by prenom , cid et period
    @GetMapping("/person/prenom={prenom}/cid={cid}/date1={date1}/date2={date2}")
    public List<Person> searchByPrenomCID_Period(@PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {
        return personService.searchByPrenomCID_Period(prenom, cid, date1, date2);
    }

    //search by nom, prenom, cid et date de naissance
    @GetMapping("/person/nom={nom}/prenom={prenom}/cid={cid}/datenaissance={datenaissance}")
    public List<Person> searchByNomPrenomCID_Datenaissance(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("datenaissance") Date datenaissance) {
        return personService.searchByNomPrenomCID_Datenaissance(nom, prenom, cid, datenaissance);
    }

    //search by nom, prenom , cid et periode
    @GetMapping("/person/nom={nom}/prenom={prenom}/cid={cid}/date1={date1}/date2={date2}")
    public List<Person> searchByNomPrenomCID_Period(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {
        return personService.searchByNomPrenomCID_Period(nom, prenom, cid, date1, date2);
    }

    //search by num
    @GetMapping("/person/num={num}")
    public List<Person> searchByNum(@PathVariable("num") Long num) {
        return personService.searchByNum(num);
    }

    //search by nom et num

    @GetMapping("/person/nom={nom}/num={num}")
    public List<Person> searchByNomNum(@PathVariable("nom") String nom, @PathVariable("num") Long num) {
        return personService.searchByNomNum(nom, num);
    }

    //search by prenom et num
    @GetMapping("/person/prenom={prenom}/num={num}")
    public List<Person> searchByPrenomNum(@PathVariable("prenom") String prenom, @PathVariable("num") Long num) {
        return personService.searchByPrenomNum(prenom, num);
    }

    //search bu cid et num
    @GetMapping("/person/cid={cid}/num={num}")
    public List<Person> searchByCID_Num(@PathVariable("cid") long cid, @PathVariable("num") Long num) {
        return personService.searchByCID_Num(cid, num);
    }

    //search by date de naissance et num
    @GetMapping("/person/datenaissance={datenaissance}/num={num}")
    public List<Person> searchByDatenaissanceNum(@PathVariable("datenaissance") Date datenaissance, @PathVariable("num") Long num) {
        return personService.searchByDatenaissanceNum(datenaissance, num);
    }

    //search By Period et num
    @GetMapping("/person/date1={date1}/date2={date2}/num={num}")
    public List<Person> searchByPeriodNum(@PathVariable("date1") Date date1, @PathVariable("date2") Date date2, @PathVariable("num") Long num) {
        return personService.searchByPeriodNum(date1, date2, num);
    }

    //search by nom , prenom et num
    @GetMapping("/person/nom={nom}/prenom={prenom}/num={num}")
    public List<Person> searchByNomPrenomNum(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("num") Long num) {
        return personService.searchByNomPrenomNum(nom, prenom, num);
    }

    //saerch by nom , cid et num
    @GetMapping("/person/nom={nom}/cid={cid}/num={num}")
    public List<Person> searchByNomCID_Num(@PathVariable("nom") String nom, @PathVariable("cid") long cid, @PathVariable("num") Long num) {
        return personService.searchByNomCID_Num(nom, cid, num);
    }

    //search by nom , date de naissance et num
    @GetMapping("/person/nom={nom}/datenaissance={datenaissance}/num={num}")
    public List<Person> searchByNomDatenaissanceNum(@PathVariable("nom") String nom, @PathVariable("datenaissance") Date datenaissance, @PathVariable("num") Long num) {
        return personService.searchByNomDatenaissanceNum(nom, datenaissance, num);
    }

    //search by nom , periode et num
    @GetMapping("/person/nom={nom}/date1={date1}/date2={date2}/num={num}")
    public List<Person> searchByNomPeriodNum(@PathVariable("nom") String nom, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2, @PathVariable("num") Long num) {
        return personService.searchByNomPeriodNum(nom, date1, date2, num);
    }

    //saerch by prenom , cid et num
    @GetMapping("/person/prenom={prenom}/cid={cid}/num={num}")
    public List<Person> searchByPrenomCID_Num(@PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("num") Long num) {
        return personService.searchByPrenomCID_Num(prenom, cid, num);
    }

    //search by prenom , date de naissance et num
    @GetMapping("/person/prenom={prenom}/datenaissance={datenaissance}/num={num}")
    public List<Person> searchBPrenomDatenaissanceNum(@PathVariable("prenom") String prenom, @PathVariable("datenaissance") Date datenaissance, @PathVariable("num") Long num) {
        return personService.searchByPrenomDatenaissanceNum(prenom, datenaissance, num);
    }

    //search by prenom , periode et num
    @GetMapping("/person/prenom={nom}/date1={date1}/date2={date2}/num={num}")
    public List<Person> searchByPrenomPeriodNum(@PathVariable("prenom") String prenom, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2, @PathVariable("num") Long num) {
        return personService.searchByPrenomPeriodNum(prenom, date1, date2, num);
    }

    //search by cid , date de naissance et num
    @GetMapping("/person/cid={cid}/datenaissance={datenaissance}/num={num}")
    public List<Person> searchByCID_DatenaissanceNum(@PathVariable("cid") long cid, @PathVariable("datenaissance") Date datenaissance, @PathVariable("num") Long num) {
        return personService.searchByCID_DatenaissanceNum(cid, datenaissance, num);
    }

    //search by cid , periode et num
    @GetMapping("/person/cid={cid}/date1={date1}/date2={date2}/num={num}")
    public List<Person> searchByCID_PeriodeNum(@PathVariable("cid") long cid, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2, @PathVariable("num") Long num) {
        return personService.searchByCID_PeriodNum(cid, date1, date2, num);
    }

    //search by nom , prenom , cid et num
    @GetMapping("/person/nom={nom}/prenom={prenom}/cid={cid}/num={num}")
    public List<Person> searchByNomPrenomCID_Num(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("num") Long num) {
        return personService.searchByNomPrenomCID_Num(nom, prenom, cid, num);
    }

    //search by nom , prenom , date de naissance et num
    @GetMapping("/person/nom={nom}/prenom={prenom}/datenaissance={datenaissance}/num={num}")
    public List<Person> searchByNomPrenomDatenaissanceNum(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("datenaissance") Date datenaissance, @PathVariable("num") Long num) {
        return personService.searchByNomPrenomDatenaissanceNum(nom, prenom, datenaissance, num);
    }

    //search by nom, prenom , periode et num
    @GetMapping("/person/nom={nom}/prenom={prenom}/date1={date1}/date2={date2}/num={num}")
    public List<Person> searchByNomPrenomPeriodNum(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2, @PathVariable("num") Long num) {
        return personService.searchByNomPrenomPeriodNum(nom, prenom, date1, date2, num);
    }

    //search by prenom, cid , date de naissance et num
    @GetMapping("/person/prenom={prenom}/cid={cid}/datenaissance={datenaissance}/num={num}")
    public List<Person> searchByPrenomCID_DatenaissanceNum(@PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("datenaissance") Date datenaissance, @PathVariable("num") Long num) {
        return personService.searchByPrenomCID_DatenaissanceNum(prenom, cid, datenaissance, num);
    }

    //search by prenom , cid , period et num
    @GetMapping("/person/prenom={prenom}/cid={cid}/date1={date1}/date2={date2}/num={num}")
    public List<Person> searchByPrenomCID_PeriodNum(@PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2, @PathVariable("num") Long num) {
        return personService.searchByPrenomCID_PeriodNum(prenom, cid, date1, date2, num);
    }

    //search by nom, prenom, cid , date de naissance et num
    @GetMapping("/person/nom={nom}/prenom={prenom}/cid={cid}/datenaissance={datenaissance}/num={num}")
    public List<Person> searchByNomPrenomCID_DatenaissanceNum(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("datenaissance") Date datenaissance, @PathVariable("num") Long num) {
        return personService.searchByNomPrenomCID_DatenaissanceNum(nom, prenom, cid, datenaissance, num);
    }

    //search by nom, prenom , cid , periode et num
    @GetMapping("/person/nom={nom}/prenom={prenom}/cid={cid}/date1={date1}/date2={date2}/num={num}")
    public List<Person> searchByNomPrenomCID_PeriodNum(@PathVariable("nom") String nom, @PathVariable("prenom") String prenom, @PathVariable("cid") long cid, @PathVariable("date1") Date date1, @PathVariable("date2") Date date2, @PathVariable("num") Long num) {
        return personService.searchByNomPrenomCID_PeriodNum(nom, prenom, cid, date1, date2, num);
    }

    //set num to 0
    @PutMapping("/person/numnum={id}")
    public boolean setnumtoz(@PathVariable("id") Long id) {
        return personService.setpersonNum(id);
    }

}