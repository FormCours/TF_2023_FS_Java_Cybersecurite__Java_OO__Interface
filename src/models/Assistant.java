package models;

import interfaces.IPerson;
import interfaces.IStudent;
import interfaces.ITeacher;

import java.time.LocalDate;
import java.util.List;

public class Assistant extends Student  implements IPerson, IStudent, ITeacher {

    public Assistant(String firstname, String lastname, char gender, String matricule, double result) {
        super(firstname, lastname, gender, matricule, result);
    }

    public Assistant(String firstname, String lastname, char gender, LocalDate birthdate, String matricule, double result) {
        super(firstname, lastname, gender, birthdate, matricule, result);
    }

    @Override
    public void teach(IStudent student, String course) {
        System.out.println("L'etudiant " + getLastname() + "donne cours de " + course);
        student.study(course);
    }

    @Override
    public void teach(List<IStudent> students, String course) {
        System.out.println("L'etudiant " + getLastname() + "donne cours de " + course + " à une classe");
        for(IStudent student : students) {
            student.study(course);
        }
    }
}
