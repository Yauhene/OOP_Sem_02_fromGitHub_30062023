package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Flyable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью 15 км/");
        return 15;
    }
}