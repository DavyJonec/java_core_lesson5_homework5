package ru.geekbrains.lesson5;

public class Homework5 {
    public static void main(String[] args) {
        Cooperator[] coopArray = new Cooperator[5];
        coopArray[0] = new Cooperator("Boris", "engineer", "borisen@mail.ru", "8(954)-238-24-50", 70000, 35);
        coopArray[1] = new Cooperator("Fedor", "medic", "Fmedic@mail.ru", "8(880)-555-35-35", 35000, 25);
        coopArray[2] = new Cooperator("Borya", "doyar", "doyar@mail.ru", "8(593)-268-45-25", 20000, 40);
        coopArray[3] = new Cooperator("Gry", "villian", "Gry@mail.ru", "8(593)-218-45-23", 2000000, 41);
        coopArray[4] = new Cooperator("Baba Zina", "sosedka", "sosedka@mail.ru", "8(783)-211-53-23", 13000, 70);

        for (Cooperator coo : coopArray) {
            if(coo.age > 40){
                coo.outputCooperator();
            }
        }

    }
}