package interfaces;

public interface IStudent extends IPerson {

    String getMatricule();
    double getResult();

    void study(String course);
}
