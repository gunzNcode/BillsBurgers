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

    //getters
    public String getBunType() {
        return bunType;
    }

    public String getMeatType() {
        return meatType;
    }

    public boolean isHasLettuce() {
        return hasLettuce;
    }

    public boolean isHasTomato() {
        return hasTomato;
    }

    public boolean isHasCarrot() {
        return hasCarrot;
    }

    public boolean isHasPickles() {
        return hasPickles;
    }

    public int getAdditionalItems() {
        return additionalItems;
    }

    public double getPrice() {
        return price;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }
}
