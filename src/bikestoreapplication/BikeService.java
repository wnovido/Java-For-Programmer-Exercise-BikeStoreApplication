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
public class BikeService {
    public static Bike CreateBike(String myColor, int mySize, double myPrice, String myType) {
        Bike myBike = new Bike(myColor, mySize, myPrice, myType);
        return myBike;
    }
}
