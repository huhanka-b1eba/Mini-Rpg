package org.example.model;

public class Human extends Mob {
    protected String surname;

    public Human(String name, String surname, int hp, int damage) {
        super(name, hp, damage);
        this.surname = surname;
    }

    public void readBook() {
        System.out.println("Вы читаете книгу, вы восстанавливаете 1 очко здоровья");
        ++hp;
    }

    public void toEat() {
        System.out.println("Вы готовите, вы восстанавливаете 2 очка здоровья");
        hp += 2;
    }

    @Override
    public String toString() {
        return "Привет " + name + " " + surname;
    }
}
