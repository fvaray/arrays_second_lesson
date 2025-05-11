//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] salaries = {100, 80, 35, 120, 70};
        int sum = 0;
        for (int salaryEmpl : salaries) {
            sum += salaryEmpl;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        int[] weekSpending = {30, 40, 20, 80, 50};
        int min = weekSpending[0], max = weekSpending[0];
        for (int j : weekSpending) {
            if (j < min)
                min = j;
            if (j > max)
                max = j;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println("Задача 3");
        float averageSal = 0;
        sum = 0;
        for (int salary : salaries) {
            sum = sum + salary;
        }
        averageSal = (float) sum / salaries.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSal + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        System.out.println(reverseFullName);
    }
}