/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT02;

/**
 *
 * @author DELL
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account (String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void credit (int amount){
        balance += amount;
    }
    public void debit (int amount) {
        if(balance>=amount){
            balance -= amount;
        } else
        {
            System.out.println("Giao dich that bai(Khong du so du tai khoan.)");
        }
    }
    public void transferTo(Account other, int amount) {
        if(balance>=amount) {
            balance -= amount;
            other.balance += amount;
        } else
        {
            System.out.println("Chuyen khoan that bai(Khong du so du tai khoan.)");
        }
    }
}

