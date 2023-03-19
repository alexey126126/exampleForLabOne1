package org.example.entity;

import java.util.Date;

public class WiredInternetContract extends ContractAbstract{
    private double connectionSpeed;
    public WiredInternetContract(String typeOfContract, int id, Date contractStartDate, Date contractCompletionDate,
                                    int numbersOfContract, Object сontractOwner, double connectionSpeed) {
        super(typeOfContract, id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.connectionSpeed = connectionSpeed;
    }
}
