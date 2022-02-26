package app.model;

import java.util.Date;

public class Transaction {
    String account_number;
    double transaction_number;
    Date transaction_date;


    public Transaction(String account_number, double transaction_number, Date transaction_date) {
        this.account_number = account_number;
        this.transaction_number = transaction_number;
        this.transaction_date = transaction_date;
    }


    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getTransaction_number() {
        return transaction_number;
    }

    public void setTransaction_number(double transaction_number) {
        this.transaction_number = transaction_number;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public double getTransaction_amount() {
//        Todo
        return 0.0;
    }
}
