package org.example.entity;

import java.util.Date;

public class MobileCommunicationContract extends ContractAbstract{
    private int limitOfMinutes;
    private int limitOfSMS;
    private int limitOfTraffic;
    public MobileCommunicationContract(String typeOfContract, int id, Date contractStartDate, Date contractCompletionDate, int numbersOfContract,
                                       Object сontractOwner, int limitOfMinutes, int limitOfSMS, int limitOfTraffic) {
        super(typeOfContract, id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.limitOfMinutes = limitOfMinutes;
        this.limitOfSMS = limitOfSMS;
        this.limitOfTraffic = limitOfTraffic;
    }
}
