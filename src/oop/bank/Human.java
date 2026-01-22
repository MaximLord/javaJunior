package oop.bank;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String numberPhone;

    public Human(String firstName, String lastName, String numberPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
