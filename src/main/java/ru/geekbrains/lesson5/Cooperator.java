package ru.geekbrains.lesson5;

public class Cooperator {
    String name;
    String function;
    String email;
    String number;
    int wage;
    int age;

    public Cooperator(String name, String function, String email, String number, int wage, int age) {
        this.name = name;
        this.function = function;
        this.email = email;
        this.number = number;
        this.wage = wage;
        this.age = age;
    }
    public void outputCooperator() {
        System.out.printf("Cooperator %s with function %s have mail %s and have number %s receives a salary %d aged %d \n", this.name, this.function, this.email, this.number, this.wage, this.age);
    }
}
