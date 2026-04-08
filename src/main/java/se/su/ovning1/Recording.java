package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25{

    protected final int year;
    protected int condition;
    protected final String artist;
    protected final double price;

    protected Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.year = year;
        this.artist = artist;
        this.condition = condition;
        this.price = price;

    }

    public abstract String getType();

    public String getArtist(){
        return artist;
    }

    public int getCondition(){
        return condition;
    }

    public double getPrice(){
        double newPrice = price * condition * 0.1;
        if (newPrice < 10) {
            newPrice = 10;
        }
        //return Math.max(10, price * condition / 10);
        return newPrice;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return getType() + ": artist = '" + artist + "', name = '" + getName() + "', year = " + year + 
                ", condition = " + condition + ", original price = " + getOriginalPrice() + 
                ", price = " + getPrice() + ", price+VAT = " + getPriceWithVAT();
    }

    protected double getOriginalPrice(){
        return price;
    }
    
}
