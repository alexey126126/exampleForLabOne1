package Entity;

import java.util.Date;

public class WiredInternetContract extends ContractAbstract{
    private double connectionSpeed;
    public WiredInternetContract(int id, Date contractStartDate, Date contractCompletionDate,
                                    int numbersOfContract, Object сontractOwner, double connectionSpeed) {
        super(id, contractStartDate, contractCompletionDate, numbersOfContract, сontractOwner);
        this.connectionSpeed = connectionSpeed;
    }
}
