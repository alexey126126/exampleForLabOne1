package org.example.entity;

import java.util.Date;

public class WiredInternetContract extends Contract {
    private double connectionSpeed;

    public WiredInternetContract(int id, Date contractStartDate, Date contractCompletionDate,
                                 int numbersOfContract, Human сontractOwner, double connectionSpeed) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.connectionSpeed = connectionSpeed;
    }

    @Override
    public String toString() {
        return "WiredInternetContract{" +
                "connectionSpeed=" + connectionSpeed +
                '}';
    }
}
