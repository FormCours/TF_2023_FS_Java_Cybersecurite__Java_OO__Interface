package interfaces;

import java.time.LocalDate;

public interface IPerson {

    String getFirstname();
    String getLastname();
    String getFullname();

    char getGender();

    LocalDate getBirthdate();
    int getAge();
}
