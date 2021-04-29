package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        health = 50;
        damage = 20;
        hasArmor = false;
    }

    @Override
    public int doDamage() {
        return super.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        super.sufferDamage(damage);
    }
}
