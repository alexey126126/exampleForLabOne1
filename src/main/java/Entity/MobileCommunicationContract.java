package Entity;

import java.util.Date;

public class MobileCommunicationContract extends ContractAbstract{
    private int limitOfMinutes;
    private int limitOfSMS;
    private int limitOfTraffic;
    public MobileCommunicationContract(int id, Date contractStartDate, Date contractCompletionDate, int numbersOfContract,
                                       Object сontractOwner, int limitOfMinutes, int limitOfSMS, int limitOfTraffic) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.limitOfMinutes = limitOfMinutes;
        this.limitOfSMS = limitOfSMS;
        this.limitOfTraffic = limitOfTraffic;
    }
}
