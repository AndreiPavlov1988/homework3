//task 1
public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен" + age + "то он не достиг совершеннолетия, нужно немного подождать");
        }
//task 2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице" + temperature + " градусов, можно идти без шапки");
        }
//task3
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
//task 4
        int age1 = 24;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему еще рано в учреждения");
        }
//task 5
        int age2 = 4;

        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
//task6
        int peopleCount = 83;
        if (peopleCount < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (peopleCount < 102) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
//task7
        int one = 2;
        int two = 6;
        int three = 5;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}
