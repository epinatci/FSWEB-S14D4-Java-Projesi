package com.workintech.store.main;

import com.workintech.store.model.Bread;
import com.workintech.store.model.Chocolate;
import com.workintech.store.model.Coke;
import com.workintech.store.model.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] sales = new ProductForSale[5];
        sales[0] = new Chocolate("Sweet", 20,"Yazılımcı dostu", "brown", true);
        sales[1] = new Bread("Bakery", 50,"Siyez unundan ekmek", "einkorn", "brown");
        sales[2] = new Coke("Drinks", 10,"Soğuk içiniz",true);

        listProducts(sales);
        listProducts(null);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null){
            for (ProductForSale product: products){
                if(product != null){
                    product.showDetails();
                }
            }
        }else{
            System.out.println("Products can't be null");
        }

    }
}