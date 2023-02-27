package homework1;

public class Task2 {

    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = (isReweOpen == true) || (isEdekaOpen == true);
        System.out.println(canBuy);

    }
}
//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
// открыты магазины или нет. Реализует логический метод canBuy,, возвращающий true **
// Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
// Отобразите строку «Я могу купить еду, это ……» и значение.
