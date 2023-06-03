/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author THANH TAI
 */
public class Account {
    private String username;
    private String password_a;
    private int MANV;

    public Account() {
    }

    public Account(String username, String password_a, int MANV) {
        this.username = username;
        this.password_a = password_a;
        this.MANV = MANV;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword_a() {
        return password_a;
    }

    public void setPassword_a(String password_a) {
        this.password_a = password_a;
    }

    public int getMANV() {
        return MANV;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }
    
    
    
}
