//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] salaries = {100, 80, 35, 120, 70};
        int sum = 0;
        for (int salaryEmpl: salaries) {
            sum += salaryEmpl;
            System.out.println("sum = " + sum);
        }
    }
}