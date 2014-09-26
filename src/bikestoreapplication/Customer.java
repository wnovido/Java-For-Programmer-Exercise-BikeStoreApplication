/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bikestoreapplication;

/**
 *
 * @author wilso_000
 */
public class Customer {
    private String firstName;
    private Bike bike;
    private CreditCard customerCreditCard;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public CreditCard getCustomerCreditCard() {
        return customerCreditCard;
    }

    public void setCustomerCreditCard(CreditCard customerCreditCard) {
        this.customerCreditCard = customerCreditCard;
    }

    public Customer(String firstName, CreditCard customerCreditCard) {
        this.firstName = firstName;
        this.customerCreditCard = customerCreditCard;
    } 
}
