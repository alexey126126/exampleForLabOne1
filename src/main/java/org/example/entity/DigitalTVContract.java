package org.example.entity;

import java.util.Date;

public class DigitalTVContract extends ContractAbstract{
    private Object channelPackage;
    public DigitalTVContract(String typeOfContract, int id, Date contractStartDate, Date contractCompletionDate,
                                int numbersOfContract, Object сontractOwner, Object channelPackage) {
        super(typeOfContract, id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.channelPackage = channelPackage;
    }
}
