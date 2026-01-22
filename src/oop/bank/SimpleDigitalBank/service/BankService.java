package oop.bank.SimpleDigitalBank.service;

import oop.bank.Exception.UserRefusedException;
import oop.bank.SimpleDigitalBank.entity.Bank;
import oop.bank.SimpleDigitalBank.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankService {
    private Bank bank;

    public BankService(Bank bank) {
        this.bank = bank;
    }

    public void infoBank(Bank bank) {
        System.out.println("Название банка: " + bank.getBankName() + "\n" + "Номер bic банка: " + bank.getBic());
    }

    public void addUsersInBank(List<User> userList) {
        for (User user : userList) {
            try {
                processSingleUserRegistration(user);
            } catch (UserRefusedException e) {
                System.out.println("Пропускаем пользователя: " + e.getMessage());
            }
        }
        System.out.println("Обработка всех пользователей завершена.");
    }

    private void processSingleUserRegistration(User user) throws UserRefusedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Вы хотите стать клиентом " + bank.getBankName() + "?");
            String tf = scanner.nextLine().toLowerCase();
            if (tf.equals("no")) {
                throw new UserRefusedException("Операция отменена: пользователь отказался.");
            } else if (tf.equals("yes")) {
                int generateBank = random.nextInt(900) + 100;
                user.setNumberCard(generateBank);
                this.bank.getUsers().put(user.getId(), user);
                System.out.println("Пользователь " + user.getFirstName() + " успешно добавлен в " + bank.getBankName());
                System.out.println("Пользователю " + user.getFirstName() + " выдана карта с номером - " + user.getNumberCard());

                break;
            } else System.out.println("Не верный ответ");
        }
    }
}
