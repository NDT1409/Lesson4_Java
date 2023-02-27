package homework1;

public class Task3 {

    public static void main(String[] args) {

        int temperature1 = 200;
        int temperature2 = 0;

        boolean result = (temperature1 > 100) && (temperature2 < 100);
        System.out.println(result);
    }
}
//Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно,
// если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
// Вы должны написать метод, который проверяет это устройство. Ваша программа должна иметь
// переменные Temperature1 и Temperature2. В результате он выводит сообщение true или false.