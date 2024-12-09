package org.example.model;

public class Wizard extends Mob {
    private boolean hasMagic;
    public Wizard(String name, int hp, int damage, boolean hasMagic) {
        super(name, hp, damage);
        this.hasMagic = hasMagic;
    }

    public boolean isHasMagic() {
        return hasMagic;
    }

    public void setHasMagic(boolean hasMagic) {
        this.hasMagic = hasMagic;
    }

    private void drinkPotion() {
        hp += 2;
    }

    public void getFight(Mob enemy) {
        if(hasMagic) enemy.setHp(enemy.getHp() - damage - 4);
        else enemy.setHp(enemy.getHp() - damage - 2);
    }
}
