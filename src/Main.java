public class Main {
    public static void main(String[] args) {
        // Начальная сумма
        int startingScore = 50;
        // Сумма пополнения
        int replenishtAmount = 100;
        // Общая сумма с пополнением
        int result = startingScore + replenishtAmount;

        if (replenishtAmount >= 1000) {
            System.out.println("Сумма пополнения больше или равна 1000");
            System.out.println("Сумма на балансе: " + result);
            System.out.println("Начисленно бонусов: " + replenishtAmount / 10);
        } else {
            System.out.println("Сумма пополнения меньше 1000");
            System.out.println("Сумма на балансе: " + result);
            System.out.println("Начисленно бонусов: 0");
        }

        System.out.println();

        replenishtAmount = 1200;
        result = startingScore + replenishtAmount;

        if (replenishtAmount >= 1000) {
            System.out.println("Сумма пополнения больше или равна 1000");
            System.out.println("Сумма на балансе: " + result);
            System.out.println("Начисленно бонусов: " + replenishtAmount / 10);
        }
    }
}