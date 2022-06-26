package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student first = new Student();
        first.setAddDate("12.08.2021");
        first.setName("Petrov Ivan Nikolaevich");
        first.setGroup("B12");
        System.out.println(first.getName() + ", дата поступления " + first.getAddDate() + ", группа " + first.getGroup());
    }
}
