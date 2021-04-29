package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int health;
    protected int damage;
    protected boolean hasArmor;

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        health -= (hasArmor) ? damage / 2 : damage;
    }
}
