package oop.bank.SimpleDigitalBank.service;

import oop.bank.SimpleDigitalBank.entity.Bank;
import oop.bank.SimpleDigitalBank.entity.User;

public class UserService {

    public void usersList(Bank bank){
        System.out.println("Список клиентов банка " + bank.getBankName() + ":");
        for (User user : bank.getUsers().values()){
            System.out.println(user);
        }
    }



}
