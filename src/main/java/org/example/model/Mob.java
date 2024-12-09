package org.example.model;

public class Mob {
    protected String name;
    protected int hp;
    protected int damage;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Mob(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getFight(Mob enemy){
        enemy.setHp(enemy.getHp() - damage);
    }

    public String returnStatistic() {
        return "HP: " + "[" + makeBlock(hp) + "]" + "; Damage: " + "[" + makeBlock(damage) + "]";
    }

    public static String makeBlock(int countBlock) {
        String returnText = "";
        for (int i = 0; i < countBlock; i++) {
            returnText += "\u2588";
        }
        return returnText;
    }

    @Override
    public String toString() {
        return "Привет " + name;
    }
}
