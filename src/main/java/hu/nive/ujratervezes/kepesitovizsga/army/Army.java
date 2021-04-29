package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private MilitaryUnit militaryUnit;
    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> unitsToRemove = new ArrayList<>();
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
            dadOrWoundedChecker(unitsToRemove, unit);
        }
        army.removeAll(unitsToRemove);
    }

    public int getArmyDamage() {
        int armyDamage = 0;
        for (MilitaryUnit unit : army) {
            armyDamage += unit.doDamage();
        }
        return armyDamage;
    }

    public int getArmySize() {
        return army.size();
    }


    private void dadOrWoundedChecker(List<MilitaryUnit> unitsToRemove, MilitaryUnit unit) {
        if (unit.health < 25) {
            unitsToRemove.add(unit);
        }
    }
}
