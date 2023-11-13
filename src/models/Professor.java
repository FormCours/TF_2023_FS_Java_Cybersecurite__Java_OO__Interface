package models;

import interfaces.IPerson;
import interfaces.IStudent;
import interfaces.ITeacher;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Person implements IPerson, ITeacher {

    private String domain;

    public Professor(String firstname, String lastname, char gender, LocalDate birthdate, String domain) {
        super(firstname, lastname, gender, birthdate);
        setDomain(domain);
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }


    @Override
    public void teach(IStudent student, String course) {
        System.out.println(getFullname() + " donne cours de " + course);
        student.study(course);
    }
    @Override
    public void teach(List<IStudent> students, String course) {
        System.out.println(getFullname() + " donne cours de " + course + " à une classe");
        for(IStudent student : students) {
            student.study(course);
        }
    }
}
