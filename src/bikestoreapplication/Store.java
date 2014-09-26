/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bikestoreapplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wilso_000
 */
public class Store {

    private static List <Bike>collectionOfBikes = new ArrayList<>();
    public static void addBikeToStore(Bike bike) {
        collectionOfBikes.add(bike);
    }
    
    //method to sale a bike(link bike to customer)
    public static void saleABikeToCustomer(Customer customer) {       
        customer.setBike((Bike) collectionOfBikes.get(0));
        collectionOfBikes.remove(customer.getBike());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a customer with a card
        Date now = new Date();
        Customer myCustomer = CustomerService.CreateCustomer("John", 5555, now, 777);
        System.out.println(myCustomer.getFirstName() + " payed through credit card# " + myCustomer.getCustomerCreditCard().getNumber());
        
        //Create a bike from BikeService and add inventory
        Bike myBike = new Bike("red",12,500.05,"raleigh");
        addBikeToStore(myBike);
        
        //sale a bike to myCustomer
        saleABikeToCustomer(myCustomer);
        System.out.println(myCustomer.getFirstName() + " bought " + myCustomer.getBike().getColor() + " bike worth " + myCustomer.getBike().getPrice());
    }
}
