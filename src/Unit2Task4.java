import java.util.Scanner;

public class Unit2Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите A и B: ");
        int sum = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i = 1; i <= a; i++){
            sum+=b;
        }
        System.out.println("Сумма равна " + sum);
    }
}
