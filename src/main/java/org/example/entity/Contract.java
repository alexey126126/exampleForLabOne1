package org.example.entity;

import java.util.Date;

public abstract class Contract {
    private int ID;
    private Date contractStartDate;
    private Date contractCompletionDate;
    private int numbersOfContract;
    private Human сontractOwner;
    private String typeOfContract;

    public Contract(int id, Date contractStartDate, Date contractCompletionDate, int numbersOfContract, Human сontractOwner) {
        ID = id;
        this.contractStartDate = contractStartDate;
        this.contractCompletionDate = contractCompletionDate;
        this.numbersOfContract = numbersOfContract;
        this.сontractOwner = сontractOwner;
    }

    public int getID() {
        return ID;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public int getNumbersOfContract() {
        return numbersOfContract;
    }

    public Date getContractCompletionDate() {
        return contractCompletionDate;
    }

    public Object getСontractOwner() {
        return сontractOwner;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "ID=" + ID +
                ", contractStartDate=" + contractStartDate +
                ", contractCompletionDate=" + contractCompletionDate +
                ", numbersOfContract=" + numbersOfContract +
                ", сontractOwner=" + сontractOwner +
                ", typeOfContract='" + typeOfContract + '\'' +
                '}';
    }
}
