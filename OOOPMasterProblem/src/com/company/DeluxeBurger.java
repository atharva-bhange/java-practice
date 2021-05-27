package com.company;

public class DeluxeBurger extends BaseBurger {
    private boolean isChips;
    private boolean isDrinks;
    static double chipsPrice = 12;
    static double drinksPrice = 14;

    public DeluxeBurger( String breadRoll, String meat) {
        super("DeluxeBurger", breadRoll, meat, 12);
        this.addChips();
        this.addDrinks();
    }

    private void addChips() {
        // Chips cost 12
        isChips = true;
        super.addPrice(DeluxeBurger.chipsPrice);
    }

    private void addDrinks() {
        // Drinks cost 14
        isDrinks = true;
        super.addPrice(DeluxeBurger.drinksPrice);
    }

    public boolean isChips() {
        return isChips;
    }

    public boolean isDrinks() {
        return isDrinks;
    }

    @Override
    public void displayInvoice() {
        super.displayInvoice();
        if(this.isChips) System.out.println("Chips (Included) : $ "+DeluxeBurger.chipsPrice);
        if(this.isDrinks) System.out.println("Drinks (Included) : $ "+DeluxeBurger.drinksPrice);
    }
}
