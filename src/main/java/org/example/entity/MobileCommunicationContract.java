package org.example.entity;

import java.util.Date;

public class MobileCommunicationContract extends Contract {
    private int limitOfMinutes;
    private int limitOfSMS;
    private int limitOfTraffic;
    public MobileCommunicationContract(int id, Date contractStartDate, Date contractCompletionDate, int numbersOfContract,
                                      Human сontractOwner, int limitOfMinutes, int limitOfSMS, int limitOfTraffic) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.limitOfMinutes = limitOfMinutes;
        this.limitOfSMS = limitOfSMS;
        this.limitOfTraffic = limitOfTraffic;
    }

    @Override
    public String toString() {
        return "MobileCommunicationContract{" +
                "limitOfMinutes=" + limitOfMinutes +
                ", limitOfSMS=" + limitOfSMS +
                ", limitOfTraffic=" + limitOfTraffic +
                '}';
    }
}
