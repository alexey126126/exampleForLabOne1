package org.example.entity;

import java.time.LocalDate;

public class DigitalTVContract extends Contract {
    private int channelPackage;
    public DigitalTVContract(int id, LocalDate contractStartDate, LocalDate contractCompletionDate,
                                int numbersOfContract, Human сontractOwner, int channelPackage) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.channelPackage = channelPackage;
    }

    @Override
    public String toString() {
        return "DigitalTVContract{" +
                "ID=" + getID() +
                ", contractStartDate=" + getContractStartDate() +
                ", contractCompletionDate=" + getContractCompletionDate() +
                ", numbersOfContract=" + getNumbersOfContract() +
                ", contractOwner=" + getContractOwner() + '\'' +
                "channelPackage=" + channelPackage +
                '}';
    }
}
