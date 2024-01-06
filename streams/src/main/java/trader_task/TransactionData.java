package trader_task;

import java.util.Arrays;
import java.util.List;

public class TransactionData {

    public static List<Transaction> getAll(){

        Trader raoul=new Trader("Raoul","Cambridge");
        Trader mario=new Trader("Mario","Cambridge");
        Trader alan=new Trader("Alan","Milan");
        Trader brian=new Trader("Brain","Cambridge");

        return Arrays.asList(
                new Transaction(brian,2017,300),
                new Transaction(raoul,2011,1000),
                new Transaction(raoul,2015,400),
                new Transaction(mario,2015,710),
                new Transaction(mario,2011,700),
                new Transaction(alan,2017,950)
                );
    }

}
