package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat kos = new Cat();
        kos.food = "korm";
        kos.name = "Kosmos";
        Cat gav = new Cat();
        gav.name = "Gav";
        gav.eat("kotleta");
        Cat black = new Cat();
        black.name = "Black";
        black.eat("fish");
        System.out.println("There are gav's food.");
        gav.show();
        System.out.println("There are black's food.");
        black.show();
        System.out.println("There are kos's food.");
        kos.show();
    }
}
