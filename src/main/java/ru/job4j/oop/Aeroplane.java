package ru.job4j.oop;

public class Aeroplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " самолет летает по воздуху");
    }
}
