package oop.bank.SimpleDigitalBank.entity;

public class Terminal {
    private int numberATM;
    private Bank terminalOfThisBank;

    public Terminal(int numberATM, Bank terminalOfThisBank) {
        this.numberATM = numberATM;
        this.terminalOfThisBank = terminalOfThisBank;
    }

    public int getNumberATM() {
        return numberATM;
    }

    public void setNumberATM(int numberATM) {
        this.numberATM = numberATM;
    }

    public Bank getTerminalOfThisBank() {
        return terminalOfThisBank;
    }

    public void setTerminalOfThisBank(Bank terminalOfThisBank) {
        this.terminalOfThisBank = terminalOfThisBank;
    }
}
