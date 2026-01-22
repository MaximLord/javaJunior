package oop.bank;

public class User extends Human {
    private Integer id;
    private String Login;
    private String password;
    private double balance;

    public User(String firstName, String lastName, String numberPhone, Integer id, String login, String password, double balance) {
        super(firstName, lastName, numberPhone);
        this.id = id;
        this.Login = login;
        this.password = password;
        this.balance = balance;
    }

    public void infoUser() {
        System.out.println("Имя: " + getFirstName() +
                "\n" +
                        "Фамилия: " + getLastName() +
                "\n" +
                        "Номер телефона: " + getNumberPhone() + "\n");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
}
