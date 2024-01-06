package trader_task;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {

        //1- find all transactions in 2011 and sort by value
        //Find all transactions in the year 2011 and sort them by value(small to high)


        //myway
        System.out.println("=============Solution #1=============");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .map(Transaction::getValue)
                .sorted()
                .forEach(System.out::println);

        System.out.println("=============Efficient Solution=============");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2- What are all the unique cities where the trader work?
        System.out.println("******************Task 2*************************");

        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);


        //3- Find all traders from Cambridge and sort them by name
        System.out.println("******************Task 3*************************");

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4- return a string of all trader's names sorted alphabetically
        System.out.println("******************Task 4*************************");

       String result=TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1, name2)->name1+name2+" ");

        System.out.println(result);

        //5- Are there any traders based in Milan
        System.out.println("******************Task 5*************************");

        boolean milanBased=TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        //6- print the values of all transactions from the traders living in Cambridge
        System.out.println("******************Task 6*************************");

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getValue())
                .forEach(System.out::println);

        //7- What is the highest value of all the transactions
        System.out.println("******************Task 7*************************");

        Optional<Integer> maxValue=TransactionData.getAll().stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max);
        System.out.println(maxValue);

        //8- Find the transaction with smallest value
        System.out.println("******************Task 8*************************");

        Optional<Transaction> minValue=TransactionData.getAll().stream()
                .reduce((t1, t2)->t1.getValue()<t2.getValue() ? t1 : t2);
        System.out.println(minValue.get());

        //more efficient solution
        Optional<Transaction> smallestValue=TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));

        System.out.println(smallestValue.get());




    }
}
