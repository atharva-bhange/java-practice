package com.company;

public class PLayer {
    private String name;
    private int hitPoint;
    private  String  weapon;

    public PLayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 100){
            this.hitPoint = health;
        }
        this.hitPoint = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoint -= damage;
        if(this.hitPoint <= 0){
            System.out.println("Player dead!");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoint;
    }

    public String getWeapon() {
        return weapon;
    }
}
