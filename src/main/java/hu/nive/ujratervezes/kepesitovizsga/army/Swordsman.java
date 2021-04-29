package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasShield;

    public Swordsman(boolean hasArmor) {
        health = 100;
        damage = 10;
        this.hasArmor = hasArmor;
        hasShield = true;
    }

    @Override
    public int doDamage() {
        return super.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        if (!hasShield) {
            super.sufferDamage(damage);
        } else {
            hasShield = false;
        }
    }
}
