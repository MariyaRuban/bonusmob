public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.


        int balanceCheck = 10;
        int sum = 1_830;

        int bonus;
        if (sum > 1_000) {
            bonus = sum / 100;
            System.out.println(bonus);
            System.out.println("бонусов");
        } else {
            bonus = 0;
            System.out.println(bonus);
            System.out.println("бонусов");
        }
        int balanceOut = balanceCheck + sum + bonus;
        System.out.println(balanceOut);
        System.out.println("итоговая сумма на счёте");


    }
}