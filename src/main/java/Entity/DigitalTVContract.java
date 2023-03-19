package Entity;

import java.util.Date;

public class DigitalTVContract extends ContractAbstract{
    private Object channelPackage;
    public DigitalTVContract(int id, Date contractStartDate, Date contractCompletionDate,
                                int numbersOfContract, Object сontractOwner, Object channelPackage) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.channelPackage = channelPackage;
    }
}
