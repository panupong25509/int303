/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.mockup.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author INT303
 */
public class ShoppingCart implements Serializable {

    private Map<String, LineItem> cart;

    public ShoppingCart() {
        this.cart = new HashMap();
    }

    public void add(Product p) {
        LineItem line = this.cart.get(p.getProductCode());
        if (line == null) {
            this.cart.put(p.getProductCode(), new LineItem(p));
        } else {
            line.setQuantity(line.getQuantity() + 1);
        }
    }

    public void remove(Product p) {
        this.remove(p.getProductCode());
    }

    public void remove(String productCode) {
        this.cart.remove(productCode);
    }

    public double getTotalPrice() {
        double all = 0;
        Collection<LineItem> lineItems = this.cart.values();
        for (LineItem lineItem : lineItems) {
            all += lineItem.getTotalPrice();
        }
        return all;
    }
    
     public int getTotalQuantity() {
        int all = 0;
        Collection<LineItem> lineItems = this.cart.values();
        for (LineItem lineItem : lineItems) {
            all += lineItem.getQuantity();
        }
        return all;
    }
     
    public List<LineItem> getLineItems(){
        return new ArrayList(this.cart.values());
    }
}
