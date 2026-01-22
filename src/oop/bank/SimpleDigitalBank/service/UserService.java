package oop.bank.SimpleDigitalBank.service;

import oop.bank.SimpleDigitalBank.entity.Bank;
import oop.bank.SimpleDigitalBank.entity.User;

import java.util.List;

public class UserService {
    private List<User> users;

    public void usersList(Bank bank){
        System.out.println("Список клиентов банка " + bank.getBankName() + ":");
        for (User user : bank.getUsers().values()){
            System.out.println(user);
        }
    }



}
