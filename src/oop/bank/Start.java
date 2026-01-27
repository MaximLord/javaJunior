package oop.bank;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Bank sberbank = new Bank("sber", 1);
        sberbank.infoBank();

        User maxim = new User("Maxim", "Pospelov", "89241389499", 1, "123", "111", 350);
        maxim.infoUser();
        User sergei = new User("Sergei", "Gulic", "89024823663", 2, "234", "222", 550);
        sergei.infoUser();
        User andrei = new User("Andrei", "Martin", "null", 3, "345", "333", 770);
        andrei.infoUser();
        System.out.println("////////////////////////////////////////////////////////////");


        List<User> sberbankList = new ArrayList<>();
        sberbankList.add(maxim);
        sberbankList.add(sergei);
        sberbankList.add(andrei);
        sberbank.listAllUsers();

        sberbank.registerUsers(sberbankList);

        System.out.println("////////////////////////////////////////////////////////////");
        sberbank.dropUser(sergei);
        sberbank.listAllUsers();

        System.out.println("////////////////////////////////////////////////////////////");
        Terminal terminal = new Terminal();

    }
}
