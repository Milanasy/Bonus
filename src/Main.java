public class Main {
    public static void main(String[] args) {
        // Начальная сумма
        int startingScore = 50;
        // Сумма пополнения
        int replenishtAmount = 1100;
        // Общая сумма с пополнением
        int result = startingScore + replenishtAmount;

        if (replenishtAmount >= 1000) {
            System.out.println("Сумма пополнения: " + replenishtAmount);
            System.out.println("Сумма на балансе: " + result);
            System.out.println("Начисленно бонусов: " + replenishtAmount / 10);
        } else {
            System.out.println("Сумма пополнения: " + replenishtAmount);
            System.out.println("Сумма на балансе: " + result);
            System.out.println("Начисленно бонусов: 0");
        }
    }
}