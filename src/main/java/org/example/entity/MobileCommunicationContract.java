package org.example.entity;

import java.time.LocalDate;

public class MobileCommunicationContract extends Contract {
    private int limitOfMinutes;
    private int limitOfSMS;
    private int limitOfTraffic;
    public MobileCommunicationContract(int id, LocalDate contractStartDate, LocalDate contractCompletionDate, int numbersOfContract,
                                      Human contractOwner, int limitOfMinutes, int limitOfSMS, int limitOfTraffic) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, contractOwner);
        this.limitOfMinutes = limitOfMinutes;
        this.limitOfSMS = limitOfSMS;
        this.limitOfTraffic = limitOfTraffic;
    }

    @Override
    public String toString() {
        return "MobileCommunicationContract{" +
                "ID=" + getID() +
                ", contractStartDate=" + getContractStartDate() +
                ", contractCompletionDate=" + getContractCompletionDate() +
                ", numbersOfContract=" + getNumbersOfContract() +
                ", contractOwner=" + getContractOwner() + '\'' +
                "limitOfMinutes=" + limitOfMinutes +
                ", limitOfSMS=" + limitOfSMS +
                ", limitOfTraffic=" + limitOfTraffic +
                '}';
    }
}
