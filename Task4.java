package homework1;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Date;
public class Task4 {

    public static void main(String[] args) {

         int n = ThreadLocalRandom.current().nextInt(-1, 28801);
         int p = n / 3600;

         System.out.println("Осталось " + n + " секунд.");


         if (p == 1) {
             System.out.println("Осталось " + p + " час.");
         }  if (p > 1 && p < 5) {
            System.out.println("Осталось " + p + " часа.");
            return;
         }  else if (p > 4 && p < 10) {
            System.out.println("Осталось " + p + " часов.");
         }
    }
}
//Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
// Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
// когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
// а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные
// фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Обьяснение: в переменную n должно записываться случайное (на время тестирования программы)
// целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех,
// кто понимает в секундах) и на следующей строке (для тех кто не понимает) должна выводиться фраза
// о количестве полных часов, содержащихся в n секундах.