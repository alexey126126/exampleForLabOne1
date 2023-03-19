package org.example.entity;

import java.util.Date;

public class Human {
    private int ID;
    private String name;
    private String surname;
    private String patronymic;
    private Date dateOfBirth;
    private boolean gender;
    private int passportSeries;
    private int passportNumber;

    public Human(int ID, String name, String surname, String patronymic, Date dateOfBirth,
                 boolean gender, int passportSeries, int passportNumber) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int createAge(Date date) {
        date = getDateOfBirth();
        Date today = new Date();
        int yearBirth = date.getYear();
        int yearToday = today.getYear();
        return yearToday-yearBirth;
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
                '}';
    }
}
