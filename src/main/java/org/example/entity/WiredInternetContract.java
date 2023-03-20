package org.example.entity;

import java.time.LocalDate;

public class WiredInternetContract extends Contract {
    private double connectionSpeed;

    public WiredInternetContract(int id, LocalDate contractStartDate, LocalDate contractCompletionDate,
                                 int numbersOfContract, Human сontractOwner, double connectionSpeed) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.connectionSpeed = connectionSpeed;
    }

    @Override
    public String toString() {
        return "WiredInternetContract{" +
                "ID=" + getID() +
                ", contractStartDate=" + getContractStartDate() +
                ", contractCompletionDate=" + getContractCompletionDate() +
                ", numbersOfContract=" + getNumbersOfContract() +
                ", contractOwner=" + getContractOwner() +
                "connectionSpeed=" + connectionSpeed +
                '}';
    }
}
