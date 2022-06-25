package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(){

    }

    public  Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 5, "Ошибка - 2");
        Error error3 = new Error(true, 5, "Ошибка - 3");
        Error error4 = new Error(false, 20, "Ошибка - 4");
        Error error5 = new Error(false, 0, "Ошибка - 5");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
        error4.printInfo();
        error5.printInfo();
    }
}
