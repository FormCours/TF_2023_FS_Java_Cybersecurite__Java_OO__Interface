import interfaces.IStudent;
import interfaces.ITeacher;
import models.Assistant;
import models.LearningMachine;
import models.Professor;
import models.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Professor della = new Professor("Della", "Duck", 'F',
                LocalDate.of(1988, 3, 5), "Informatique");

        Student zaza = new Student("Zaza", "Vanderquack", 'F', "zava4321", 18);


        ArrayList<IStudent> students = new ArrayList<>();
        students.add(new Student("Riri", "Duck", 'M', "ridu123", 16));
        students.add(zaza);
        students.add(new Student("Fifi", "Duck", 'M', "fidu123", 7));
        students.add(new Assistant("Lili", "Duck", 'X', "lidu456", 19));

        ITeacher prof1 = della;
        prof1.teach(students, "Java");
        System.out.println();

        ITeacher prof2 = new LearningMachine();
        prof2.teach(students, "Uml");


    }
}