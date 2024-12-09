package org.example;

import org.example.model.Knight;
import org.example.model.Orc;
import org.example.model.Peaceful;
import org.example.model.Wizard;

public class Main {
    public static void main(String[] args) {
        Knight knight1 = new Knight("Сфинктерион", "Лёвинхарт", 20, 5, true);
        Orc orc1 = new Orc("Амоматор", 30, 4, true);
        Peaceful p1 = new Peaceful("Иван", "Калита", 10, 2, false);
        Wizard wiz1 = new Wizard("Лефантий", 25, 8, true);

        System.out.println(orc1.returnStatistic());
        wiz1.getFight(orc1);
        System.out.println(orc1.returnStatistic());

    }
}