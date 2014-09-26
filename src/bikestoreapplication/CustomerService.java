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
public class CustomerService {
    public static Customer CreateCustomer (String firstName, int cardNumber, Date expirationDate, int code) {
        CreditCard myCreditCard = new CreditCard(cardNumber, expirationDate, code);
        Customer myCustomer = new Customer(firstName, myCreditCard);
        return myCustomer;    
    }
}
