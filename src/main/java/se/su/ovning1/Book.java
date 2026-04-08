package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{

    private final String author;
    private final double price;
    private final boolean bound;

    public Book(String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    public double getPrice(){
        if (bound){
            return this.price * 1.3;
        } else return this.price;
    }

    public String toString(){
        return "Book: " + getName() + ", " + author + ", " + getPrice() + ", " + bound + ", " + getPriceWithVAT();
    }

}
