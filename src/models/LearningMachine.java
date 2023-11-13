package models;

import interfaces.IStudent;
import interfaces.ITeacher;

import java.util.List;
import java.util.Random;

public class LearningMachine implements ITeacher {

    @Override
    public void teach(IStudent student, String course) {

        Random rng = new Random();
        int val = rng.nextInt(4);

        if(val == 0) {
            student.study(course);
        }
        else {
            System.out.println(student.getFullname() + " se prend une baffe !");
        }
    }

    @Override
    public void teach(List<IStudent> students, String course) {

        for(IStudent student : students) {
            teach(student, course);
        }
    }
}
