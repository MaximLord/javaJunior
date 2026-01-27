package oop.bank.SimpleDigitalBank.entity;

//Хранилище пользователей: Map<Integer, User>, где ключ — ID пользователя.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {
    private String bankName;
    private int bic;
    private Map<Integer, User> users = new HashMap<>();

    public Bank(String bankName) {
        Random random = new Random();
        this.bankName = bankName;
        this.bic = random.nextInt(10000);
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

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Integer, User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bic=" + bic +
                ", users=" + users +
                '}';
    }

}
