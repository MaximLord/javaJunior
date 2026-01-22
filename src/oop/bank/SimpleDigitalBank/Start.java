package oop.bank.SimpleDigitalBank;

import oop.bank.Exception.UserRefusedException;
import oop.bank.SimpleDigitalBank.entity.Bank;
import oop.bank.SimpleDigitalBank.entity.User;
import oop.bank.SimpleDigitalBank.service.BankService;
import oop.bank.SimpleDigitalBank.service.UserService;

import java.util.ArrayList;
import java.util.List;

import static oop.bank.SimpleDigitalBank.Enums.AccountStatus.ACTIVE;


public class Start {
    public static void main(String[] args){
        Bank sber = new Bank("sber");

        List<User> usersList = new ArrayList<>();
        usersList.add(new User(1, "Maxim", "Pospelov", "maxim", "max", 324.2, 0, ACTIVE));
        usersList.add(new User(2, "Ivan", "Ivanod", "ivan", "iva", 423.4, 0, ACTIVE));

        //Добавление пользователей в нужный банк
        BankService bankService = new BankService(sber);
        bankService.addUsersInBank(usersList);

        //Вывод информации о клиентах банка
        UserService userService = new UserService();
        userService.usersList(sber);

//        //Вывод информации о банке
//        BankService bankService = new BankService();
//        bankService.infoBank(sber);
    }
}
