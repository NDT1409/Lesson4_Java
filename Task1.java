package homework1;

public class Task1 {

    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = (isWeekend == true) && (isRain == false);
        System.out.println(canWalk);
    }
}
//Создайте две переменные isWeekend и isRain. Создайте переменную canWalk,
// значение которой должно быть истинным, если это выходной день (isWeekend=true)
// и не идет дождь (isRain=false).
