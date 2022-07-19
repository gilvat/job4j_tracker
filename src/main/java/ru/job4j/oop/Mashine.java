package ru.job4j.oop;

public class Mashine {
    public static void main(String[] args) {
        Vehicle aero = new Aeroplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{aero, train, bus};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
