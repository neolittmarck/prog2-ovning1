package se.su.ovning1;

public class LongPlay extends Recording{

    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    public String getType() {
        return ("LP");
    }

    public double getPrice(){
        double currentYear = 2026;
        double addedValue = (currentYear - year) * 5;
        double newPrice = price * condition * 0.1;
        if (newPrice <= 10) {
            newPrice = 10;
        }
        return newPrice + addedValue;
    }
    
}
