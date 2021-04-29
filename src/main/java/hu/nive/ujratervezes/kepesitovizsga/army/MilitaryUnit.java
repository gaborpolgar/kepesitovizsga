package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

     int health;
     int damage;
     boolean hasArmor;

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        health -= (hasArmor) ? damage / 2 : damage;
    }
}
