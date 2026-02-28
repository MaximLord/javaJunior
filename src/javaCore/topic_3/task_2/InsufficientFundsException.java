package javaCore.topic_3.task_2;

public class InsufficientFundsException extends Exception{
    private double amount;
    private double balance;

    public InsufficientFundsException(String message){
        super(message);
    }

}
