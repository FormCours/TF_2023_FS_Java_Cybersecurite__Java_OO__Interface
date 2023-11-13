package interfaces;

import java.util.List;

public interface ITeacher {

    void teach(IStudent student, String course);

    void teach(List<IStudent> students, String course);

}
