package se.su.ovning1;
import java.util.ArrayList;
import java.util.Arrays;

public class Order {

    private static long counter;
    private final long orderNumber;
    private final ArrayList<Item> items;

    public Order(Item...items){

        this.items = new ArrayList<Item>(Arrays.asList(items));
        this.orderNumber = 0;
    }

    public String getReceipt(){
        return items.toString();
    }

    public double getTotalValuePlusVAT(){
        double price = 0;
        for(Item i : items){
            price += i.getPriceWithVAT();
        }
        return price;    }

    public double getTotalValue(){
        double price = 0;
        for(Item i : items){
            price += i.getPrice();
        }
        return price;
    }


    
}
