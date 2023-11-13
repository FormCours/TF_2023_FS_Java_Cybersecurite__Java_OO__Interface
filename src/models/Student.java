package models;

import interfaces.IPerson;
import interfaces.IStudent;

import java.time.LocalDate;

public class Student extends Person implements IPerson, IStudent {

    private String matricule;
    private double result;

    public Student(String firstname, String lastname, char gender, String matricule, double result) {
        super(firstname, lastname, gender);

        setMatricule(matricule);
        setResult(result);
    }

    public Student(String firstname, String lastname, char gender, LocalDate birthdate, String matricule, double result) {
        super(firstname, lastname, gender, birthdate);

        setMatricule(matricule);
        setResult(result);
    }


    @Override
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void study(String course) {
        System.out.println(getFullname() + " etudie le cours de " + course);
    }
}
