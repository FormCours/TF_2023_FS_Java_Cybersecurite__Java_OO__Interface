package models;

import interfaces.IPerson;

import java.text.Format;
import java.text.MessageFormat;
import java.time.LocalDate;

public abstract class Person implements IPerson {

    private String firstname;
    private String lastname;
    private char gender;
    private LocalDate birthdate;

    public Person(String firstname, String lastname, char gender) {
        setFirstname(firstname);
        setLastname(lastname);
        setGender(gender);
        setBirthdate(null);
    }
    public Person(String firstname, String lastname, char gender, LocalDate birthdate) {
        this(firstname, lastname, gender);
        setBirthdate(birthdate);
    }

    @Override
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getFullname() {
        return MessageFormat.format("{0} {1}", getFirstname(), getLastname());
    }

    @Override
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public int getAge() {
        if(getBirthdate() == null) {
            return -1;
        }

        // TODO Fix method !
        return LocalDate.now().getYear() - getBirthdate().getYear();
    }
}
