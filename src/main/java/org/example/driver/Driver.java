package org.example.driver;

import org.example.entity.*;
import org.example.repository.Repository;

import java.util.Date;

public class Driver {
    public static void driver () {
        Repository repository = new Repository();
        repository.addAll(
                new WiredInternetContract(
                        1,
                        new Date("2023-03-20"),
                        new Date("2024-03-20"),
                        1,
                        new Human(
                            1,
                            "Алексей",
                            "Шульгин",
                            "Андреевич",
                            new Date("2002-12-04"),
                            Gender.MALE,
                            2021,
                            456274 ),
                        50.5),
                new MobileCommunicationContract(
                        2,
                        new Date("2023-02-21"),
                        new Date("2026-02-21"),
                        2,
                        new Human(2,
                                "Кирилл",
                                "Иванов",
                                "Иванович",
                                new Date("2001-05-09"),
                                Gender.MALE,
                                2020,
                                347384),
                        500,
                        1000,
                        30),
                new DigitalTVContract(
                        3,
                        new Date("2023-01-25"),
                        new Date("2024-01-25"),
                        3,
                        new Human(
                                3,
                                "Мария",
                                "Прокофьева",
                                "Викторовна",
                                new Date("1999-03-08"),
                                Gender.FEMALE,
                                2017,
                                693746),
                        120)
        );


    }


}
