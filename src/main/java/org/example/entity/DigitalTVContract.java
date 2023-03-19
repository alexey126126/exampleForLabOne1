package org.example.entity;

import java.util.Date;

public class DigitalTVContract extends Contract {
    private Object channelPackage;
    public DigitalTVContract(int id, Date contractStartDate, Date contractCompletionDate,
                                int numbersOfContract, Human сontractOwner, Object channelPackage) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.channelPackage = channelPackage;
    }

    @Override
    public String toString() {
        return "DigitalTVContract{" +
                "channelPackage=" + channelPackage +
                '}';
    }
}
