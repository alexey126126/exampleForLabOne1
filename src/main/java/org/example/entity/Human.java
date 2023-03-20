package org.example.entity;
import java.time.LocalDate;

public class Human {
    private int ID;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Gender gender;
    private int passportSeries;
    private int passportNumber;



    public Human(int ID, String name, String surname, String patronymic, LocalDate dateOfBirth,
                 Gender gender, int passportSeries, int passportNumber) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    private int getAge() {
        LocalDate date = this.dateOfBirth;
        LocalDate today = LocalDate.now();
        return (date.until(today)).getYears();
    }

    @Override
    public String toString() {
        return "Human{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", passportSeries=" + passportSeries +
                ", passportNumber=" + passportNumber +
                ", age=" + getAge() +
                '}';
    }
}
