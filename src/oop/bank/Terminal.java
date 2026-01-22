package oop.bank;

import java.util.Scanner;

public class Terminal {

    Scanner scanner = new Scanner(System.in);
    public void insertCard(Bank numberCardBank) {
        System.out.println("Вставьте карту в терминал и введите логин и пароль! \n");

        Scanner scanner = new Scanner(System.in);
        if (numberCardBank.equals(numberCardBank)){
            System.out.println("введен пароль");
        }
    }


//
//    public boolean authenticate(User login, User password) {
//        User user = new User()
//        if ( login.equals(login) && password.equals(password)) {
//            return true;
//        } else return false;
//    }
}

