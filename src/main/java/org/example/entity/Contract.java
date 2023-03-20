package org.example.entity;

import java.time.LocalDate;


public abstract class Contract {
    private int ID;
    private LocalDate contractStartDate;
    private LocalDate contractCompletionDate;
    private int numbersOfContract;
    private Human contractOwner;


    public Contract(int id, LocalDate contractStartDate, LocalDate contractCompletionDate, int numbersOfContract, Human сontractOwner) {
        ID = id;
        this.contractStartDate = contractStartDate;
        this.contractCompletionDate = contractCompletionDate;
        this.numbersOfContract = numbersOfContract;
        this.contractOwner = contractOwner;
    }

    public int getID() {
        return ID;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public int getNumbersOfContract() {
        return numbersOfContract;
    }

    public LocalDate getContractCompletionDate() {
        return contractCompletionDate;
    }

    public Object getContractOwner() {
        return contractOwner;
    }



    @Override
    public String toString() {
        return "Contract{" +
                "ID=" + ID +
                ", contractStartDate=" + contractStartDate +
                ", contractCompletionDate=" + contractCompletionDate +
                ", numbersOfContract=" + numbersOfContract +
                ", contractOwner=" + contractOwner + '\'' +
                '}';
    }
}
