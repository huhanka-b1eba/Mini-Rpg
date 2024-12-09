package org.example.model;

public class Knight extends Human{
    private boolean hasSword;
    public Knight(String name, String surname, int hp, int damage, boolean hasSword) {
        super(name, surname, hp, damage);
        this.hasSword = hasSword;
    }

    public boolean isHasSword() {
        return hasSword;
    }

    public void setHasSword(boolean hasSword) {
        this.hasSword = hasSword;
    }

    public void getFight(Mob enemy) {
        if(hasSword) enemy.setHp(enemy.getHp() - damage - 3);
        else enemy.setHp(enemy.getHp() - damage - 1);
    }
}
