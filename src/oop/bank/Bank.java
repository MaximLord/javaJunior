package oop.bank;

import oop.bank.exception.UserRefusedException;

import java.util.*;

public class Bank {
    private String bankName;
    private int bic;

    public Bank(String bankName, int bic) {
        Random rand = new Random();
        this.bankName = bankName;
        this.bic = rand.nextInt(10000);
    }

    private Map<Integer, User> users = new HashMap();

    private void addUsers(User user) throws UserRefusedException {
        System.out.println(user.getFirstName() + ", вы хотите стать нашим клиентом?");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String tf = scanner.nextLine().trim().toLowerCase();

            if (tf.equals("no")) {
                throw new UserRefusedException("Пользователь отказался стать клиентом банка");
            } else if (tf.equals("yes")) {
                users.put(user.getId(), user);
                System.out.println("Пользователь: " + user.toString() + " успешно добавлен!");

                Random rand = new Random();
                int numberCardBank = rand.nextInt(900) + 100;
                System.out.println("Пользователю: " + user.toString() + " выдали банковскую карту " + numberCardBank);
                break;
            } else {
                System.out.println("Некорректный ввод, попробуйте еще раз");
            }
        }
    }

    public void registerUsers(List<User> userList) {
        for (User user : userList) {
            try {
                addUsers(user);
            } catch (UserRefusedException e) {
                System.out.println("Пропускаем пользователя: " + e.getMessage());
            }
        }
        System.out.println("Обработка всех пользователей завершена.");
    }

    public void dropUser(User user) {
        users.remove(user.getId());
        System.out.println("Пользователь: " + user.toString() + " успешно удален!");
    }

    public List<User> listAllUsers() {
        List<User> usersList = new ArrayList<>();
        for (User user : users.values()) {
            System.out.println(user);
        }
        return usersList;
    }

    public void infoBank() {
        System.out.println("Банк: " + bankName + ", БИК: " + bic);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBic() {
        return bic;
    }

    public void setBic(int bic) {
        this.bic = bic;
    }
}
