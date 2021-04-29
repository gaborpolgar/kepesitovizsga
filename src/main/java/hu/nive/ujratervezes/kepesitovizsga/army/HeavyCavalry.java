package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean hasFirstAttack;

    public HeavyCavalry() {
        health = 150;
        damage = 20;
        hasArmor = true;
        hasFirstAttack = true;
    }

    @Override
    public int doDamage() {
        if (hasFirstAttack){
            hasFirstAttack = false;
            return damage *3;
        }
        return super.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {
        super.sufferDamage(damage);
    }
}
