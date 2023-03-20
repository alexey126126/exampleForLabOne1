package org.example.driver;

import org.example.entity.*;
import org.example.repository.Repository;

import java.time.LocalDate;


public class Driver {
    public static void driver () {
        Repository repository = new Repository();
        repository.addAll(
                new WiredInternetContract(
                        1,
                        LocalDate.of(2023, 03, 20),
                        LocalDate.of(2024, 03, 20),
                        1,
                        new Human(
                            1,
                            "Алексей",
                            "Шульгин",
                            "Андреевич",
                            LocalDate.of(2002, 12, 04),
                            Gender.MALE,
                            2021,
                            456274 ),
                        50.5),
                new MobileCommunicationContract(
                        2,
                        LocalDate.of(2023, 02, 21),
                        LocalDate.of(2026, 02, 21),
                        2,
                        new Human(2,
                                "Кирилл",
                                "Иванов",
                                "Иванович",
                                LocalDate.of(2001, 05, 9),
                                Gender.MALE,
                                2020,
                                347384),
                        500,
                        1000,
                        30),
                new DigitalTVContract(
                        3,
                        LocalDate.of(2023,01,25),
                        LocalDate.of(2024, 01, 25),
                        3,
                        new Human(
                                3,
                                "Мария",
                                "Прокофьева",
                                "Викторовна",
                                LocalDate.of(1999, 03, 8),
                                Gender.FEMALE,
                                2017,
                                693746),
                        120)
        );
        repository.printById(3);


    }


}
