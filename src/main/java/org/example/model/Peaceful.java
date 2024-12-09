package org.example.model;

public class Peaceful extends Human{
    private boolean hasFork;
    public Peaceful(String name, String surname, int hp, int damage, boolean hasFork) {
        super(name, surname, hp, damage);
        this.hasFork = hasFork;
    }

    public boolean isHasFork() {
        return hasFork;
    }

    public void setHasFork(boolean hasFork) {
        this.hasFork = hasFork;
    }

    public void getFight(Mob enemy) {
        if(hasFork) enemy.setHp(enemy.getHp() - damage - 1);
        else enemy.setHp(enemy.getHp() - damage);
    }
}
