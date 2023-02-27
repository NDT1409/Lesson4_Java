package homework1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task5 {

    public static void main(String[] args) {

        int n = 60;
        System.out.println(ThreadLocalRandom.current().nextInt(1, (n + 1)));

    }
}
//Напишите метод, который в качестве входящего параметра принимает
// количество студентов в классе и возвращает случайно выбранный номер студента, начиная со второго.
//Например, если мы передаём в метод, что в классе 18 студентов,
// то метод должен вернуть случайное число из диапазона 2 - 18 (включительно).