public class Hamburger {

    //Fields
    private String bunType;
    private String meatType;
    private boolean hasLettuce, hasTomato, hasCarrot, hasPickles;
    private int additionalItems; //Each item will be priced the same $0.10
    private double price;
    private double additionalCost = 0.30;

    //constructor
    public Hamburger(String bunType, String meatType, double price) {
        this.bunType = bunType;
        this.meatType = meatType;
        this.price = price;
    }

    //add lettuce
    public void addLettuce(){
        hasLettuce = true;
        price += additionalCost;
    }

    //add tomato
    public void addTomato(){
        hasTomato = true;
        price += additionalCost;
    }

    //add carrot
    public void addCarrot(){
        hasCarrot = true;
        price += additionalCost;
    }

    //add pickles
    public void addPickles(){
        hasPickles = true;
        price += additionalCost;
    }
}
