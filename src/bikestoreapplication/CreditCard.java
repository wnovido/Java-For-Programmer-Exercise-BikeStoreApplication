/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bikestoreapplication;

import java.util.Date;

/**
 *
 * @author wilso_000
 */
public class CreditCard {
    private int number;
    private Date expirationDate;
    private int code;
    private String picture;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public CreditCard(int number, Date expirationDate, int code) {
        this.number = number;
        this.expirationDate = expirationDate;
        this.code = code;       
    }
        
}
