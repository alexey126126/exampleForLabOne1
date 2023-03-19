package org.example.entity;

import java.util.Date;

public abstract class ContractAbstract {
    private int ID;
    private Date contractStartDate;
    private Date contractCompletionDate;
    private int numbersOfContract;
    private Object сontractOwner;
    private String typeOfContract;

    public ContractAbstract(String typeOfContract, int id, Date contractStartDate, Date contractCompletionDate, int numbersOfContract,
                               Object сontractOwner) {
        this.typeOfContract = typeOfContract;
        ID = id;
        this.contractStartDate = contractStartDate;
        this.contractCompletionDate = contractCompletionDate;
        this.numbersOfContract = numbersOfContract;
        this.сontractOwner = сontractOwner;
    }
}
