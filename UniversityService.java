package pro.aloginov.revoluttest;

import pro.aloginov.revoluttest.model.University;

import java.util.HashMap;
import java.util.Map;

public class UniversityService {

    public final Map<Integer, University>universityrep = new HashMap<>();

    public UniversityService(University university) {
        this.university = university;
    }

    University university;


    public int AddUniversity(int id, String name, String adress, String city){
        University university = new University(id,name,adress,city);


        universityrep.put(id,university);

        return university.id;


    }

    public University GetUnuversity(int id){
        University university = universityrep.get(id);
        return university;
    }

    public int DeleteUniversity(int id){
        University university = universityrep.get(id);
        universityrep.remove(university);
        return university.id;
    }
    public University ChangeFieldsUniversity(int id, String name, String adress, String city){
       University university =  universityrep.get(id);
       universityrep.remove(university);
       University newUniversity = new University(id, name, adress, city);
       universityrep.put(id,newUniversity);
       return  newUniversity;

    }

}



