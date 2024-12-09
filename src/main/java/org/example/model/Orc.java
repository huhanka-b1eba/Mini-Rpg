package org.example.model;

public class Orc extends Mob{
    private boolean combat;

    public Orc(String name, int hp, int damage, boolean combat) {
        super(name, hp, damage);
        this.combat = combat;
    }

    public boolean isCombat() {
        return combat;
    }

    public void setCombat(boolean combat) {
        this.combat = combat;
    }

    public void setAgry() {
        hp += 2;
    }

    @Override
    public String toString() {
        if (combat) return "Здравствуй, воин " + name;
        return "Привет " + name;
    }
}
