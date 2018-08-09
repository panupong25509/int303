/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.model;

import java.util.List;
import sit.int303.mockup.model.Product;

/**
 *
 * @author INT303
 */
public class TestShoppingCart {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p = new Product();
        p.setProductCode("S10_001");
        p.setProductName("Harley");
        p.setMsrp(100.0);
        cart.add(p);
        cart.add(p);
//        cart.remove("S10_001");

        p = new Product();
        p.setProductCode("S10_002");
        p.setProductName("Honda");
        p.setMsrp(15.0);

        cart.add(p);
        cart.add(p);
        cart.add(p);

        System.out.println("Total Price : " + cart.getTotalPrice());
        System.out.println("Total Quantity : " + cart.getTotalQuantity());
    
        
        List<LineItem> ls = cart.getLineItems();
        for (LineItem l : ls) {
            System.out.printf("%-8s %-15s %8.2f\n",l.getProduct().getProductCode(), l.getProduct().getProductName(), l.getProduct().getMsrp());
        }
    }
}
