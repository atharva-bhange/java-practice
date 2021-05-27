package com.company;

public class HealthyBurger extends BaseBurger {
    private boolean isHealthyOil;
    private boolean isLowFatSauce;
    static double healthyOilPrice = 10;
    static double lowFatSaucePrice = 8;

    public HealthyBurger( String meat ) {
        super("HealthyBurger", "Brown Rye Bread", meat, 10);
        this.isHealthyOil = false;
        this.isLowFatSauce = false;
    }

    public void addHealthyOil() {
        // Healthy Oil costs 10
        isHealthyOil = true;
        super.addPrice(HealthyBurger.healthyOilPrice);
    }

    public void addLowFatSauce() {
        // Healthy Oil costs 8
        isLowFatSauce = true;
        super.addPrice(HealthyBurger.lowFatSaucePrice);
    }

    public boolean isHealthyOil() {
        return isHealthyOil;
    }

    public boolean isLowFatSauce() {
        return isLowFatSauce;
    }

    @Override
    public void displayInvoice() {
        super.displayInvoice();
        if(this.isHealthyOil) System.out.println("Healthy Oil : $ "+HealthyBurger.healthyOilPrice);
        if(this.isLowFatSauce) System.out.println("Low Fat Sauce : $ "+HealthyBurger.lowFatSaucePrice);
    }
}
