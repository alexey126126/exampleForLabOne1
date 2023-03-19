package org.example.entity;

import java.util.Date;

public abstract class Contract {
    private int ID;
    private Date contractStartDate;
    private Date contractCompletionDate;
    private int numbersOfContract;
    private Human contractOwner;
    private String typeOfContract;

    public Contract(int id, Date contractStartDate, Date contractCompletionDate, int numbersOfContract, Human сontractOwner) {
        ID = id;
        this.contractStartDate = contractStartDate;
        this.contractCompletionDate = contractCompletionDate;
        this.numbersOfContract = numbersOfContract;
        this.contractOwner = contractOwner;
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

    public Object getContractOwner() {
        return contractOwner;
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
                ", contractOwner=" + contractOwner +
                ", typeOfContract='" + typeOfContract + '\'' +
                '}';
    }
}
