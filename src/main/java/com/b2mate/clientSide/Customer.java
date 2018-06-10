package com.b2mate.clientSide;

/**
 * Created by Will on 6/9/18.
 */
import org.springframework.data.annotation.Id;
public class Customer {

    @Id
    private String id;

    private String telegram;
    private String email;
    private String symbol;
    private double low;
    private double high;

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Customer() {}

    public Customer(String telegramID, String email, String symbol, double low, double high) {
        this.telegram = telegramID;
        this.email = email;
        this.symbol = symbol;
        this.low = low;
        this.high = high;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, telegramID='%s', email='%s']",
                id, telegram, email);
    }

}
